package server.tool;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//通用简单表格导出工具，调用本工具的Controller返回类型需为void
public class ExcelUtils_Kang {
    /**
     * @param title     表第一行标题 如："表格标题"
     * @param columnMap 字段名，列名  对应map,如：put("key","value"),若put("key","")，则生成表时不生成此列
     * @param dataList  数据集合，需与表头数组中的字段名一致，并且符合javabean规范
     * @return 返回一个HSSFWorkbook
     * @throws Exception
     */
    private static <T> HSSFWorkbook getHSSFWorkbook(
            String title,
            Map<String, String> columnMap,
            Boolean showHeaderColumn,
            List<T> dataList,
            Boolean withIndex,
            List<HeaderColumn>... extraHeaderColumn) throws Exception {

        // 创建一个Workbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        // 在Workbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet(title);
        //删去列对象中，值为""的对象
        columnMap.keySet().removeIf(key -> columnMap.get(key).equals(""));
        int rowNum = 0;// 行数从0开始
        // 最大列下标（从0开始，比实际size小1）
        int columnCount = columnMap.keySet().size() - (withIndex ? 0 : 1);

        if (title != null) {
            int titleWidth = columnCount;
            // 在sheet中合并标总标题
            if (titleWidth > 0) {
                sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 0, titleWidth));
            }
            // 总标题行获取样式
            HSSFCellStyle titleStyle = titleStyle(wb);
            // 在sheet中添加标总标题
            HSSFRow rowTitle = sheet.createRow(rowNum++);
            HSSFCell cellTitle = rowTitle.createCell(0);// cell列 从0开始 第一列添加序号
            cellTitle.setCellValue(title);
            cellTitle.setCellStyle(titleStyle);

        }
        {
            // 额外列标题行获取样式
            HSSFCellStyle headerStyle = headerStyle(wb);
            for (List<HeaderColumn> headerColumnList : extraHeaderColumn) {
                HSSFRow rowHeader = sheet.createRow(rowNum);
                int columnIndex = 0;
                if (withIndex) {
                    // 第一列添加序号
                    String columnName = "";
                    HSSFCell sequenceCell = rowHeader.createCell(columnIndex);
                    sequenceCell.setCellValue(columnName);
                    sequenceCell.setCellStyle(headerStyle);
                    columnIndex = 1;
                }
                // 为额外标题行赋值
                {
                    for (HeaderColumn headerColumn : headerColumnList) {
                        if (StringUtils.isEmpty(headerColumn.cellValue)) {
                            for (int i = 0; i < headerColumn.cellWidth; i++) {
                                HSSFCell titleCell = rowHeader.createCell(columnIndex + i);
                                titleCell.setCellStyle(headerStyle);
                            }
                        } else {
                            String columnName = headerColumn.getCellValue();
                            HSSFCell titleCell = rowHeader.createCell(columnIndex);
                            titleCell.setCellValue(columnName);
                            titleCell.setCellStyle(headerStyle);

                            setColumnWidth(sheet, columnIndex, columnName, headerColumn.cellWidth);
                            if (columnIndex + headerColumn.cellWidth - 1 > 0) {
                                CellRangeAddress cellRangeAddress = new CellRangeAddress(rowNum, rowNum, columnIndex, columnIndex + headerColumn.cellWidth - 1);
                                sheet.addMergedRegion(cellRangeAddress);
                                setRegionStyle(sheet, cellRangeAddress, headerStyle);
                            }
                        }
                        columnIndex = columnIndex + headerColumn.cellWidth;
                    }
                }
                rowNum++;
            }
        }

        if(showHeaderColumn){
            // 列标题行获取样式
            HSSFCellStyle headerStyle = headerStyle(wb);
            HSSFRow rowHeader = sheet.createRow(rowNum++);
            int columnIndex = 0;
            if (withIndex) {
                // 第一列添加序号
                String columnName = "序号";
                setColumnWidth(sheet, columnIndex, columnName);
                HSSFCell sequenceCell = rowHeader.createCell(columnIndex);
                sequenceCell.setCellValue(columnName);
                sequenceCell.setCellStyle(headerStyle);
                columnIndex = 1;
            }
            // 为标题行赋值
            {
                for (String key : columnMap.keySet()) {
                    String columnName = columnMap.getOrDefault(key, "");
                    setColumnWidth(sheet, columnIndex, columnName);
                    HSSFCell titleCell = rowHeader.createCell(columnIndex);
                    titleCell.setCellValue(columnName);
                    titleCell.setCellStyle(headerStyle);
                    columnIndex++;
                }
            }
        }
        {
            // 数据行获取样式
            HSSFCellStyle dataStyle = dataStyle(wb);
            // 遍历集合数据，产生数据行
            Iterator<T> it = dataList.iterator();
            int rowIndex = 1;// 0总标题，1列标题，>=2数据
            while (it.hasNext()) {
                HSSFRow rowData = sheet.createRow(rowNum++);
                int columnIndex = 0;
                if (withIndex) {
                    //  序号列
                    HSSFCell sequenceCellValue = rowData.createCell(0);// 序号值永远是第0列
                    sequenceCellValue.setCellValue(rowIndex);
                    sequenceCellValue.setCellStyle(dataStyle);
                    columnIndex = 1;
                }
                T t = it.next();
                // 利用反射，根据传过来的字段名数组，动态调用对应的getXxx()方法得到属性值
                {

                    for (String key : columnMap.keySet()) {
                        HSSFCell dataCell = rowData.createCell(columnIndex);
                        dataCell.setCellStyle(dataStyle);
                        String getMethodName = "get" + key.substring(0, 1).toUpperCase() + key.substring(1);// 取得对应getXxx()方法
                        Class<?> tCls = t.getClass();// 泛型为Object以及所有Object的子类
                        Method getMethod = tCls.getMethod(getMethodName);// 通过方法名得到对应的方法
                        Object value = getMethod.invoke(t);// 动态调用方,得到属性值
                        if(value instanceof Date){
                            SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            String time = format0.format(value);//这个就是把时间戳经过处理得到期望格式的时间

                            dataCell.setCellValue(time);// 为当前列赋值
                            setColumnWidth(sheet, columnIndex,time);

                        }
                        else
                        {
                            if (value != null) {
                                dataCell.setCellValue(value.toString());// 为当前列赋值
                                setColumnWidth(sheet, columnIndex, value.toString());
                            }
                        }

                        columnIndex++;
                    }
                }
                rowIndex++;
            }
        }

        // 设置请求

        return wb;
    }

    private static void responseOut(HttpServletResponse response, HSSFWorkbook wb, String fileName) throws IOException {
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode(fileName + ".xls", "UTF-8"));
        response.setHeader("Access-Control-Expose-Headers", "Content-disposition");
        OutputStream outputStream = response.getOutputStream();// 打开流
        wb.write(outputStream);// HSSFWorkbook写入流
        wb.close();// HSSFWorkbook关闭
        outputStream.flush();// 刷新流
        outputStream.close();// 关闭流
    }

    public static <T> void export(HttpServletResponse response,
                                  String fileName,
                                  String title,
                                  Map<String, String> columnMap,
                                  Boolean showHeaderColumn,
                                  List<T> dataList,
                                  Boolean withIndex,
                                  List<HeaderColumn>... extraHeaderColumn) throws Exception {
        HSSFWorkbook hssfWorkbook = getHSSFWorkbook(title, columnMap, showHeaderColumn, dataList, withIndex, extraHeaderColumn);
        responseOut(response, hssfWorkbook, fileName);
    }

    private static HSSFCellStyle titleStyle(HSSFWorkbook wb) {
        // 设置标题样式
        HSSFCellStyle style = wb.createCellStyle();
        // 设置单元格边框样式
        style.setBorderTop(BorderStyle.THIN);// 上边框 细边线
        style.setBorderBottom(BorderStyle.THIN);// 下边框 细边线
        style.setBorderLeft(BorderStyle.THIN);// 左边框 细边线
        style.setBorderRight(BorderStyle.THIN);// 右边框 细边线
        // 设置单元格对齐方式
        style.setAlignment(HorizontalAlignment.CENTER); // 水平居中
        style.setVerticalAlignment(VerticalAlignment.CENTER); // 垂直居中
        // 设置字体样式
        Font titleFont = wb.createFont();
        titleFont.setFontHeightInPoints((short) 12); // 字体高度
        titleFont.setFontName("ARIAL"); // 字体样式
        titleFont.setBold(true);
        style.setFont(titleFont);
        return style;
    }

    private static HSSFCellStyle headerStyle(HSSFWorkbook wb) {
        // 设置列名样式
        HSSFCellStyle style = wb.createCellStyle();
        // 设置单元格边框样式
        style.setBorderTop(BorderStyle.THIN);// 上边框 细边线
        style.setBorderBottom(BorderStyle.THIN);// 下边框 细边线
        style.setBorderLeft(BorderStyle.THIN);// 左边框 细边线
        style.setBorderRight(BorderStyle.THIN);// 右边框 细边线
        // 设置单元格对齐方式
        style.setAlignment(HorizontalAlignment.CENTER); // 水平居中
        style.setVerticalAlignment(VerticalAlignment.CENTER); // 垂直居中

        // 设置字体样式
        Font titleFont = wb.createFont();
        titleFont.setFontHeightInPoints((short) 10); // 字体高度
        titleFont.setFontName("ARIAL"); // 字体样式
        titleFont.setBold(true);
        style.setFont(titleFont);
        return style;
    }

    private static HSSFCellStyle dataStyle(HSSFWorkbook wb) {
        // 数据样式 （因为标题和数据样式不同 需要分开设置 不然会覆盖）
        HSSFCellStyle style = wb.createCellStyle();
        // 设置数据边框
        style.setBorderTop(BorderStyle.THIN);// 上边框 细边线
        style.setBorderBottom(BorderStyle.THIN);// 下边框 细边线
        style.setBorderLeft(BorderStyle.THIN);// 左边框 细边线
        style.setBorderRight(BorderStyle.THIN);// 右边框 细边线
        // 设置居中样式
        style.setAlignment(HorizontalAlignment.CENTER); // 水平居中
        style.setVerticalAlignment(VerticalAlignment.CENTER); // 垂直居中
        // 设置数据字体
        Font dataFont = wb.createFont();
        dataFont.setFontHeightInPoints((short) 10); // 字体高度
        dataFont.setFontName("ARIAL"); // 字体
        style.setFont(dataFont);
        return style;
    }

    private static void setRegionStyle(HSSFSheet sheet, CellRangeAddress region, HSSFCellStyle cs) {
        for (int i = region.getFirstRow(); i <= region.getLastRow(); i++) {

            HSSFRow row = sheet.getRow(i);
            if (row == null)
                row = sheet.createRow(i);
            for (int j = region.getFirstColumn(); j <= region.getLastColumn(); j++) {
                HSSFCell cell = row.getCell(j);
                if (cell == null) {
                    cell = row.createCell(j);
                    cell.setCellValue("");
                }
                cell.setCellStyle(cs);

            }
        }
    }

    private static void setColumnWidth(HSSFSheet sheet, int columnNum, String value, int regionNum) {
        int codeCount = 0;
        for (int i = 0; i < value.length(); i++) {
            String tempStr = value.substring(i, i + 1);
            char tempChar = tempStr.toCharArray()[0];
            if (tempChar >= 65 && tempChar <= 90) {
                codeCount += 2;
            } else {
                codeCount += (tempStr.getBytes().length >= 2 ? 2 : 1);
            }
        }
//        int a=  sheet.getColumnWidth(100);//2048
        int sheetWidth = Math.max(sheet.getColumnWidth(columnNum), codeCount * 256);
        sheet.setColumnWidth(columnNum, sheetWidth - Math.max(regionNum - 1, 0) * 2048);
    }

    private static void setColumnWidth(HSSFSheet sheet, int columnNum, String value) {
        setColumnWidth(sheet, columnNum, value, 0);
    }

    @Data
    @AllArgsConstructor
    public static class HeaderColumn {
        private String cellValue;
        private int cellWidth;

        public String getCellValue() {
            return cellValue;
        }
    }
}
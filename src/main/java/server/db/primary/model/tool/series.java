package server.db.primary.model.tool;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by william on 2019/05/07
 * Description:
 **/
public class series {
    private List<BigDecimal> list;

    public List<BigDecimal> getList() {
        return list;
    }

    public void setList(List<BigDecimal> list) {
        this.list = list;
    }
}

package server.db.primary.mapper;

import server.db.primary.model.ImgUpload;

public interface ImgUploadMapper {
    int deleteByPrimaryKey(Short id);

    int insert(ImgUpload record);

    int insertSelective(ImgUpload record);

    ImgUpload selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(ImgUpload record);

    int updateByPrimaryKey(ImgUpload record);
}
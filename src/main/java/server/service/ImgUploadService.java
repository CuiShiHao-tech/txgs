package server.service;

import server.db.primary.model.ImgUpload;

public interface ImgUploadService {
    int updateByPrimaryKeySelective(ImgUpload record);

    int insertSelective(ImgUpload record);

    ImgUpload selectByPrimaryKey(Short id);
}
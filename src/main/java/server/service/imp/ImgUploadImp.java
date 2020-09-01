package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.ImgUploadMapper;
import server.db.primary.model.ImgUpload;
import server.service.ImgUploadService;

@Service
public class ImgUploadImp implements ImgUploadService {

    @Autowired
    ImgUploadMapper imgUploadMapper;

    @Override
    public int updateByPrimaryKeySelective(ImgUpload record) {

        return  imgUploadMapper.updateByPrimaryKeySelective(record);

    }

    @Override
    public int insertSelective(ImgUpload record) {

        return  imgUploadMapper.insertSelective(record);

    }

    @Override
    public ImgUpload selectByPrimaryKey(Short id) {

        return  imgUploadMapper.selectByPrimaryKey(id);

    }
    ;
}

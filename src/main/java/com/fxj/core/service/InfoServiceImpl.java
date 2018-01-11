package com.fxj.core.service;

import com.fxj.core.bean.Info;
import com.fxj.core.dao.InfoDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author faver
 */

@Service
@Transactional
public class InfoServiceImpl implements InfoService {

    @Resource
    InfoDao infoDao;


    public Info getOne(Integer id) {
        return infoDao.getOne(id);
    }

    public void create(Info info) {
         infoDao.create(info);
    }

    public Integer createresult(Info info) {
        return infoDao.createresult(info);
    }

    public void create(Map map) {
        infoDao.create(map);
    }
}

package com.fxj.core.service;

import com.fxj.core.bean.Info;
import com.fxj.core.dao.InfoDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
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

    public Integer createresult(Map map) {
        return infoDao.createresult(map);
    }

    public List<Info> findByProperty(Info info) {
        return infoDao.findByFilter(info);
    }
    public List<Info> findByProperty(Map map) {
        return infoDao.findByFilter(map);
    }

    public List<Info> findAll(){
        return infoDao.findAll();
    };

    public void deleteById(Integer id){
         infoDao.deleteById(id);
    };
    public void deleteObj(Map map){
        infoDao.deleteObj(map);
    };

    public void update(Info info) {
        infoDao.update(info);
    }

    public void update(Map map) {
        infoDao.update(map);
    }
}

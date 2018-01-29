package com.fxj.core.service;

import com.fxj.core.bean.Shopping;
import com.fxj.core.dao.ShoppingDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author faver
 */

@Service
@Transactional
public class ShoppingServiceImpl implements ShoppingService {

    @Resource
    ShoppingDao shoppingDao;


    public Shopping getOne(Integer id) {
        return shoppingDao.getOne(id);
    }

    public void create(Shopping shopping) {
        shoppingDao.create(shopping);
    }

    public Integer createresult(Shopping shopping) {
        return shoppingDao.createresult(shopping);
    }
    public Integer createresult(Map map) {
        return shoppingDao.createresult(map);
    }

    public void create(Map map) {
        shoppingDao.create(map);
    }
}

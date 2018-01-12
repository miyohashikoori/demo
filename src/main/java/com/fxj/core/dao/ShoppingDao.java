package com.fxj.core.dao;

import com.fxj.core.bean.Shopping;

import java.util.Map;

/**
 * @author faver
 */
public interface ShoppingDao {


    public Shopping getOne(Integer id);

   public Integer createresult(Shopping shopping);

    public void create(Shopping shopping);
    public void create(Map map);
}

package com.fxj.core.service;

import com.fxj.core.bean.Shopping;

import java.util.Map;

/**
 * @author faver
 */
public interface ShoppingService {

    public Shopping getOne(Integer id);

    public Integer createresult(Shopping shopping);

    public Integer createresult(Map map);

    public void create(Shopping shopping);
    public void create(Map map);
}

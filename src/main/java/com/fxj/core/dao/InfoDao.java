package com.fxj.core.dao;

import com.fxj.core.bean.Info;

import java.util.Map;

/**
 * @author faver
 */
public interface InfoDao {


    public Info getOne(Integer id);

    public Integer createresult(Info info);

    public void create(Info info);
    public void create(Map map);
}

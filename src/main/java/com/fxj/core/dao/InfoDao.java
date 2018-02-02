package com.fxj.core.dao;

import com.fxj.core.bean.Info;

import java.util.List;
import java.util.Map;

/**
 * @author faver
 */
public interface InfoDao {


    public Info getOne(Integer id);

    public Integer createresult(Info info);
    public Integer createresult(Map map);

    public void create(Info info);
    public void create(Map map);

    public List<Info> findByFilter(Info info);
    public List<Info> findByFilter(Map map);


    public List<Info> findAll();

    public void deleteById(Integer id);
    public void deleteObj(Map map);

    public void update(Info info);
    public void update(Map map);



}

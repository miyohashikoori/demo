package com.fxj.core.service;

import com.fxj.core.bean.Info;

import java.util.Map;

/**
 * @author faver
 */
public interface InfoService {

    public Info getOne(Integer id);

    public Integer createresult(Info info);

    public void create(Info info);
    public void create(Map map);
}

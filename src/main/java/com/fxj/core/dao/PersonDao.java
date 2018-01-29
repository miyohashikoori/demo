package com.fxj.core.dao;

import com.fxj.core.bean.Person;

import java.util.List;

/**
 * @author faver
 */
public interface PersonDao {

    public Person selectPersonByid(Integer personid);
}

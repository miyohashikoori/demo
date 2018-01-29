package com.fxj.core.service;

import com.fxj.core.bean.Orders;
import com.fxj.core.bean.Person;
import com.fxj.core.dao.OrdersDao;
import com.fxj.core.dao.PersonDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author faver
 */

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Resource
    PersonDao personDao;

    public Person selectPersonByid(Integer personid) {
        return personDao.selectPersonByid(personid);
    }
}

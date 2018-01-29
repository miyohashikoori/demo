package com.fxj.core.service;

import com.fxj.core.bean.Info;
import com.fxj.core.bean.Orders;
import com.fxj.core.dao.InfoDao;
import com.fxj.core.dao.OrdersDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author faver
 */

@Service
@Transactional
public class OrdersServiceImpl implements OrdersService {

    @Resource
    OrdersDao ordersDao;

    public Orders selectOrderById(Integer orderId) {
        return ordersDao.selectOrderById(orderId);
    }
}

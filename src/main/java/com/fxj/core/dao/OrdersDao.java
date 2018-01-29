package com.fxj.core.dao;

import com.fxj.core.bean.Info;
import com.fxj.core.bean.Orders;

import java.util.List;
import java.util.Map;

/**
 * @author faver
 */
public interface OrdersDao {

    public Orders selectOrderById(Integer orderId);
    public List<Orders> selectOrderByPid(Integer pid);
}

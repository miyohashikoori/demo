package com.fxj.core.service;

import com.fxj.core.bean.Info;
import com.fxj.core.bean.Orders;

import java.util.Map;

/**
 * @author faver
 */
public interface OrdersService {

    public Orders selectOrderById(Integer orderId);
}
package com.fxj.core.controller;

import com.alibaba.fastjson.JSON;
import com.fxj.core.bean.Info;
import com.fxj.core.bean.Orders;
import com.fxj.core.service.InfoService;
import com.fxj.core.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author faver
 */

@Controller
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @RequestMapping("orders")
    public String index(ModelMap map){
        Orders orders = ordersService.selectOrderById(1);
        map.addAttribute("one",orders);
        return  "orders";
    }


}

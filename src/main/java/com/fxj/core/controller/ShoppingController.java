package com.fxj.core.controller;

import com.alibaba.fastjson.JSON;
import com.fxj.core.bean.Info;
import com.fxj.core.bean.Shopping;
import com.fxj.core.service.ShoppingService;
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
public class ShoppingController {
    @Autowired
    ShoppingService shoppingService;

    @RequestMapping("shopping")
    public String index(ModelMap map){
        Shopping one = shoppingService.getOne(2);
        map.addAttribute("one",one);
        return  "shopping";
    }

    @RequestMapping("shoppingadd")
    public String add(ModelMap map,Shopping info){

        // Map create 无返回值  自己设置id
        Map<String,Object> m=new HashMap();
        m.put("id","1");
        m.put("username","123");
        shoppingService.create(m);

        // Map create 有返回值  uuid
        Map<String,Object> mr=new HashMap();
        mr.put("username","321");
        shoppingService.createresult(mr);

        // javabean create 无返回值  自己设置id
        Shopping shopping = new Shopping();
        shopping.setId("12345678");
        shopping.setUsername("大吉大利");
        shoppingService.create(shopping);

        // javabean createresult 有返回值 uuid
        Shopping shopping1 = new Shopping();
        shopping1.setUsername("今晚吃鸡");
        Integer createresult = shoppingService.createresult(shopping1);
        String id = shopping1.getId();
        return  "shopping";
    }


    @RequestMapping(value = "shoppinginster")
    @ResponseBody
    public String inster(Info info, String name){
        Shopping one = shoppingService.getOne(48);
        return JSON.toJSONString(one);
    }


}

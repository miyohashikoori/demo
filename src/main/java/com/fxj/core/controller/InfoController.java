package com.fxj.core.controller;

import com.alibaba.fastjson.JSON;
import com.fxj.core.bean.Info;
import com.fxj.core.service.InfoService;
import freemarker.ext.beans.HashAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.ManagedMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author faver
 */

@Controller
public class InfoController {
    @Autowired
    InfoService infoService;

    @RequestMapping("index")
    public String index(ModelMap map){
        Info one = infoService.getOne(1);
        map.addAttribute("one",one);
        return  "index";
    }

    @RequestMapping("add")
    public String add(ModelMap map,Info info){
        //javabean create  无返回值
        Info i=new Info();
        i.setPwd("123");
        i.setUsername("456");
        i.setMobilePhone("789");
        infoService.create(i);

        //javabean createresult 有返回值
        Info f=new Info();
        f.setPwd("啦啦啦");
        f.setUsername("666");
        f.setMobilePhone("15759581973");
        Integer createresult = infoService.createresult(f);

        Integer id = f.getId();
        Integer id1 = i.getId();

        //map create
        Map<String,Object> m=new HashMap();
        m.put("username","123");
        m.put("pwd","456");
        m.put("mobilephone","15759581973");
        infoService.create(m);

        //map create
        Map<String,Object> mr=new HashMap();
        mr.put("username","111");
        mr.put("pwd","111");
        mr.put("mobilephone","111");
        infoService.createresult(mr);
        return  "index";
    }
    @RequestMapping(value = "inster")
    @ResponseBody
    public String inster(Info info,String name){
        Info one = infoService.getOne(48);
        return JSON.toJSONString(one);
    }


}

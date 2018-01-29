package com.fxj.core.controller;

import com.fxj.core.bean.Orders;
import com.fxj.core.bean.Person;
import com.fxj.core.service.OrdersService;
import com.fxj.core.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author faver
 */

@Controller
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("person")
    public String index(ModelMap map){
        Person person = personService.selectPersonByid(1);
        map.addAttribute("one",person);
        return  "orders";
    }


}

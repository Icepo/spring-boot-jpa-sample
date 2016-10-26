package com.xx.fun.controller;

import com.xx.fun.entity.Customer;
import com.xx.fun.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by liu on 2016/10/26.
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/index")
    public String index(Model model){
        logger.info("/index");
        model.addAttribute("name", "name");
        return "index";
    }

    @RequestMapping("/save")
    public Customer save(@Param("customer") Customer customer){
        logger.info("/save");
        return customerService.save(customer);
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable long id){
        logger.info("/delete");
        customerService.delete(id);
        return "success";
    }
}

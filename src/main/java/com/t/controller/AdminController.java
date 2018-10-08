package com.t.controller;

import com.t.domain.Admin;
import com.t.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by yfei_2200 on 2018/10/8.
 */
@RestController
public class AdminController {

    @Autowired
    IAdminService carService;

    @RequestMapping("/login")
    public ModelAndView login(ModelAndView model){
        List<Admin> list = carService.getList();
        model.setViewName("index");
        return model;
    }

}

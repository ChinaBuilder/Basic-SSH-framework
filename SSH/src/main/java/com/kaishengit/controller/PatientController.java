package com.kaishengit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yangyangxu2016 on 2016/7/30.
 */
@Controller
@RequestMapping(value = "/patient")
public class PatientController {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list (){


        return "patient-list";
    }




}

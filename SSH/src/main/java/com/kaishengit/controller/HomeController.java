package com.kaishengit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yangyangxu2016 on 2016/7/29.
 */

@Controller
@RequestMapping(value = "/home")
public class HomeController {
    /**
     * 主页get
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "/home";
    }
}

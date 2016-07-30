package com.kaishengit.controller;

import com.kaishengit.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    /**
     * login页面
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "/login";
    }

    /**
     *登录验证
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String home(User user){



    }
}


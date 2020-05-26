package com.ncepu.yun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ncepu.yun.mapper.UserMapper;

@Controller
public class HelloController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView sayHello() {
        ModelAndView modelAndView = new ModelAndView("hello");
        String username = userMapper.selectAllUser().get(0).getUsername();
        modelAndView.addObject("name", username);
        return modelAndView;
    }
}

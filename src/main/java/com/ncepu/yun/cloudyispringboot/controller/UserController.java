package com.ncepu.yun.cloudyispringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncepu.cloudyi.cloudyiapi.entity.User;
import com.ncepu.yun.cloudyispringboot.mapper.UserMapper;

/**
 * @author:huangyunyi
 **/
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/users")
    public List<User> getAllUser() {
        List<User> users = userMapper.selectAllUser();
        return users;
    }
}

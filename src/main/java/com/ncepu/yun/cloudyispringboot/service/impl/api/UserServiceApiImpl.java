package com.ncepu.yun.cloudyispringboot.service.impl.api;

import java.util.List;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncepu.cloudyi.cloudyiapi.api.UserServiceApi;
import com.ncepu.cloudyi.cloudyiapi.entity.User;
import com.ncepu.yun.cloudyispringboot.mapper.UserMapper;

@DubboService(version = "1.0.0")
public class UserServiceApiImpl implements UserServiceApi {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.selectAllUser();
    }
}

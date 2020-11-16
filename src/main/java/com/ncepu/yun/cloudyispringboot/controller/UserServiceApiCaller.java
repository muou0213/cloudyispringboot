package com.ncepu.yun.cloudyispringboot.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.DubboReference;

import com.ncepu.cloudyi.cloudyiapi.api.UserServiceApi;
import com.ncepu.cloudyi.cloudyiapi.entity.User;

/*public class UserServiceApiCaller {

    // 消费者和服务提供者在同一个项目中，所以把服务提供者是否存在的检查关掉，否则无法启动
    @DubboReference(check = false, lazy = true)
    private UserServiceApi userServiceAPI;


    public List<User> getAllUser() {
        List<User> users = userServiceAPI.getUsers();
        return users;
    }
}*/

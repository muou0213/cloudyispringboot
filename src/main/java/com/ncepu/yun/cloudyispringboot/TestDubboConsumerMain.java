package com.ncepu.yun.cloudyispringboot;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ncepu.cloudyi.cloudyiapi.api.UserServiceApi;
import com.ncepu.cloudyi.cloudyiapi.entity.User;
import com.ncepu.yun.cloudyispringboot.config.DubboConsumerConfig;


public class TestDubboConsumerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                DubboConsumerConfig.class);

        UserServiceApi userServiceApi =
                applicationContext.getBean("userServiceApi", UserServiceApi.class);

        List<User> allUser = userServiceApi.getUsers();
        System.out.println(allUser);
    }
}

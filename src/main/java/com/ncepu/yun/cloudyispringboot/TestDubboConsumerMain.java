package com.ncepu.yun.cloudyispringboot;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ncepu.cloudyi.cloudyiapi.entity.User;
import com.ncepu.yun.cloudyispringboot.config.DubboConsumerConfig;


public class TestDubboConsumerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                DubboConsumerConfig.class);

       /* UserServiceApiCaller userServiceAPICaller =
                applicationContext.getBean("userServiceAPICaller", UserServiceApiCaller.class);

        List<User> allUser = userServiceAPICaller.getAllUser();
        System.out.println(allUser);*/

    }
}

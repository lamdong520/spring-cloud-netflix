package com.cn.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-netflix
 * @ClassName: AdminController
 * @company: 鸿业（深圳）信息技术服务有限公司
 * @author: Lamdong
 * @create: 2019-11-25 17:46
 **/
@RestController
public class AdminController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String sayHi(@RequestParam("message") String message){
        return String.format("hi, your message is : %s i am from : %s", message, port);
    }
}

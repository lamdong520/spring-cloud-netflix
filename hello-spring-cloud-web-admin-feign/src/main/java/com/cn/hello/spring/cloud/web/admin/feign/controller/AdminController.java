package com.cn.hello.spring.cloud.web.admin.feign.controller;

import com.cn.hello.spring.cloud.web.admin.feign.feign.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-netflix
 * @ClassName: AdminController
 * @company: 鸿业（深圳）信息技术服务有限公司
 * @author: Lamdong
 * @create: 2019-11-26 10:10
 **/
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String message){
        return adminService.sayHi(message);
    }
}

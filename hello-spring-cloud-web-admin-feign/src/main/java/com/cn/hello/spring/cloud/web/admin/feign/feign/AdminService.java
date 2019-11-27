package com.cn.hello.spring.cloud.web.admin.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminFallback.class)
public interface AdminService {

    @GetMapping("/hi")
    String sayHi(@RequestParam("message") String message);
}

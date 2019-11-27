package com.cn.hello.spring.cloud.web.admin.feign.feign;

import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud-netflix
 * @ClassName: AdminFallback
 * @company: 鸿业（深圳）信息技术服务有限公司
 * @author: Lamdong
 * @create: 2019-11-26 12:53
 **/
@Component
public class AdminFallback implements AdminService {
    @Override
    public String sayHi(String message) {
        return "网络有问题，请重试";
    }
}

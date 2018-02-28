package cn.org.jetbrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changwenhu
 * @date 2018/2/28
 * @description ${todo}
 * @blog blog.jetbrains.org.cn
 */
@RestController
public class IndexController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/")
    public String index() {
        return "spring-cloud-eureka-client ! ! !";
    }

    @GetMapping(value = "/gc")
    public String gc() {
        return "service = " + discoveryClient.getServices();
    }
}

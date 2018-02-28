package cn.org.jetbrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author changwenhu
 * @date 2018/2/28
 * @description ${todo}
 * @blog blog.jetbrains.org.cn
 */
@RestController
public class DcController {
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    /**
     * 测试服务消费
     *
     * @return
     */
    @GetMapping("/consumer")
    public String dc() {

        //获取具体的服务提供者的地址
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";

        System.out.println(url);

        return restTemplate.getForObject(url, String.class);

    }
}

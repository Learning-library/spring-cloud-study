package cn.org.jetbrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author changwenhu
 * @date 2018/2/28
 * @description 具有负载均衡的restTemplate
 * @blog blog.jetbrains.org.cn
 */
@RestController
public class DcController {


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

        return restTemplate.getForObject("http://eureka-client/dc", String.class);

    }
}

package cn.org.jetbrains.controller;

import cn.org.jetbrains.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changwenhu
 * @date 2018/2/28
 * @description 具有容错保护的且具有负载均衡的 服务消费方式
 * @blog blog.jetbrains.org.cn
 */
@RestController
public class DcController {

    @Autowired
    private ConsumerService consumerService;

    /**
     * 测试服务消费
     * 有服务容错保护（Hystrix服务降级） eureka-client如果挂掉则执行consumerService.consumer()  HystrixCommand注解中定义的方法名称的方法
     *
     * @return
     */
    @GetMapping("/consumer")
    public String dc() {

        return consumerService.consumer();

    }
}

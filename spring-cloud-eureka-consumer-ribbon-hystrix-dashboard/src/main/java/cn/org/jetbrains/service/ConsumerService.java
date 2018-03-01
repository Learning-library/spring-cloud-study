package cn.org.jetbrains.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author changwenhu
 * @date 2018/2/28
 * @description ${todo}
 * @blog blog.jetbrains.org.cn
 */
@Service(value = "consumerService")
public class ConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback") //调用eureka-client提供的服务，如果出现问题则调用fallback方法
    public String consumer() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    public String fallback() {
        return "fallback";
    }
}

package cn.org.jetbrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * 具有负载均衡的&& 具有直接写service的简单方式 去消费eureka-client中提供的服务
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudEurekaConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaConsumerFeignApplication.class, args);
    }
}

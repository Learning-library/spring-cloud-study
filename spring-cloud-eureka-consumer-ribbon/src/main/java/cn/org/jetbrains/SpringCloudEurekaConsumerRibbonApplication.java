package cn.org.jetbrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * 具有负载均衡的 去消费eureka-client中提供的服务
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaConsumerRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced//负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

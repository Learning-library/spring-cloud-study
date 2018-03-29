package cn.org.jetbrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 与spring-cloud-hystrix-dashboard整合demo
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrix
@EnableEurekaClient
public class SpringCloudEurekaConsumerRibbonHystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaConsumerRibbonHystrixDashboardApplication.class, args);
    }

    @Bean
    @LoadBalanced//负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

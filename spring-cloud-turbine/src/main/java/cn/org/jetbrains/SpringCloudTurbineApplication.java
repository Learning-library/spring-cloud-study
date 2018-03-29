package cn.org.jetbrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;


/**
 * 使用Hystrix Dashboard来展示Hystrix用于熔断的各项度量指标。
 * 通过Hystrix Dashboard，我们可以方便的查看服务实例的综合情况，
 * 比如：服务调用次数、服务调用延迟等。
 * 但是仅通过Hystrix Dashboard我们只能实现对服务当个实例的数据展现，
 * 在生产环境我们的服务是肯定需要做高可用的，
 * 那么对于多实例的情况，我们就需要将这些度量指标数据进行聚合。
 * 下面，在本篇中，我们就来介绍一下另外一个工具：Turbine。
 * http://localhost:8989/turbine.stream 把这个地址配置到spring-cloud-hystrix-dashboard中。即可
 */

@SpringBootApplication
@EnableTurbine
@EnableEurekaClient
@EnableAutoConfiguration
@Configuration
public class SpringCloudTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTurbineApplication.class, args);
    }
}

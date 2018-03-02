package cn.org.jetbrains;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * Spring Cloud Netflix中的Zuul就担任了这样的一个角色，
 * 为微服务架构提供了前门保护的作用，
 * 同时将权限控制这些较重的非业务逻辑内容迁移到服务路由层面，
 * 使得服务集群主体能够具备更高的可复用性和可测试性。
 */
@SpringCloudApplication
@EnableZuulProxy
public class SpringCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class, args);
    }
}

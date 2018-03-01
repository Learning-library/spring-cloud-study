package cn.org.jetbrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * 结合Hystrix Dashboard实现Hystrix指标数据的可视化面板
 */
@SpringBootApplication
@EnableHystrixDashboard
public class SpringCloudHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixDashboardApplication.class, args);
    }
}

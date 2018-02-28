package cn.org.jetbrains.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author changwenhu
 * @date 2018/2/28
 * @description ${todo}
 * @blog blog.jetbrains.org.cn
 */
@FeignClient(value = "eureka-client")
public interface DcClientService {

    @GetMapping("/dc")
    String consumer();
}

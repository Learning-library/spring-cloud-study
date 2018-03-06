package cn.org.jetbrains.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changwenhu
 * @date 2018/3/5
 * @description ${todo}
 * @blog blog.jetbrains.org.cn
 */
@RestController
@RefreshScope
public class IndexController {

    @Value("${info.profile}")
    private String profile;

    @GetMapping(value = "/")
    public String index() {
        return profile;
    }
}

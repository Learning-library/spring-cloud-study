package cn.org.jetbrains.controller;

import cn.org.jetbrains.service.DcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changwenhu
 * @date 2018/2/28
 * @description ${todo}
 * @blog blog.jetbrains.org.cn
 */
@RestController
public class DcController {
    @Autowired
    private DcClientService dcClientService;

    @GetMapping("/consumer")
    public String dc() {
        return dcClientService.consumer();
    }
}

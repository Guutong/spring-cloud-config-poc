package xyz.guutong.springcloud.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.guutong.springcloud.client.service.MyConfigService;

@RestController
public class MyConfigController {

    @Autowired
    private MyConfigService configService;

    @RequestMapping("/api")
    String getApi() {
        return configService.getApplicationProperties();
    }
}

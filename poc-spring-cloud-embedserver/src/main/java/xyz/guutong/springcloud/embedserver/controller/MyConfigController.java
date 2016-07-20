package xyz.guutong.springcloud.embedserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.guutong.springcloud.embedserver.service.MyConfigService;

@RestController
public class MyConfigController {

    @Autowired
    private MyConfigService configService;

    @RequestMapping("/api")
    String getApi() {
        return configService.getApplicationProperties();
    }
}

package xyz.guutong.springcloud.embedserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import xyz.guutong.springcloud.embedserver.config.MyConfigProperties;

@Configuration
@EnableConfigurationProperties(MyConfigProperties.class)
public class MyConfigService {

    @Autowired
    private MyConfigProperties properties;

    public String getApplicationProperties(){
        return " myconfig.name="+ properties.getName()+", myconfig.endpoint="+ properties.getEndpoint();
    }
}

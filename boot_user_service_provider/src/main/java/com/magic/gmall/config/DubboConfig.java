package com.magic.gmall.config;

import com.alibaba.dubbo.config.*;
import com.magic.gmall.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Chelsea
 * @Date 2020/1/3 13:11
 */

@Configuration
public class DubboConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot_user_service_provider");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;

    }

    @Bean
    public ServiceConfig<UserService> userServiceServiceConfig(UserService userService){
        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(userService);
        serviceConfig.setVersion("1.0.0");
        //配置method信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(2000);
        //将method设置保存到service中
        List<MethodConfig> list = new ArrayList<>();
        list.add(methodConfig);
        serviceConfig.setMethods(list);
        return serviceConfig;
//        ProviderConfig
//                MonitorConfig

    }


    


}

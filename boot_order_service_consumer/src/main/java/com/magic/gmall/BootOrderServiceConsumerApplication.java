package com.magic.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class BootOrderServiceConsumerApplication {

    /**
     * 加坐标
     * 配置application.properties
     * 暴露服务@Service 调用服务@Reference
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(BootOrderServiceConsumerApplication.class, args);
    }

}

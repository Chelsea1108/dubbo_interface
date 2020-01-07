package com.magic.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 * 1.导入dubbo-starter,在application.properties配置属性，使用@Service【暴露属性】，@Reference远程调用
 * 2.保留dubbo xml配置文件，application.properties文件中注释掉,@ImportResource("classpath:provider.xml")导入配置文件
 * 3.使用注解API，配置类，将每个组件手动创建到容器中，让dubbo扫描组件即可
 *
 *
 *
 *
 */
//@EnableDubbo
//@ImportResource("classpath:provider.xml")
@EnableHystrix
@DubboComponentScan//开启基于注解的dubbo功能
@SpringBootApplication
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}

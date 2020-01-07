package com.magic.gmall;

import com.magic.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Description
 * @Author Chelsea
 * @Date 2020/1/3 0:04
 */

public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("over--------------");
        System.in.read();
    }
}

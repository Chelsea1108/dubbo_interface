package com.magic.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Description
 * @Author Chelsea
 * @Date 2020/1/2 23:02
 */

public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();


        System.in.read();
    }
}

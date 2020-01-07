package com.magic.gmall.controller;

import com.magic.gmall.bean.UserAddress;
import com.magic.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description
 * @Author Chelsea
 * @Date 2020/1/3 10:55
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(String userId){
        List<UserAddress> userAddresses = orderService.initOrder(userId);
        return userAddresses;
    }
}

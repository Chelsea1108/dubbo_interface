package com.magic.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.magic.gmall.bean.UserAddress;
import com.magic.gmall.service.OrderService;
import com.magic.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Chelsea
 * @Date 2020/1/2 18:19
 */
@Service
public class OrderServiceImpl implements OrderService {

//    @Autowired
    @Reference(loadbalance = "random")//注解远程调用
//    @Reference(url = "127.0.0.1:20880")
    UserService userService;

    public List<UserAddress> initOrder(String userId) {
        //1.查询用户收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList("1");
        System.out.println(userAddressList);
        for (UserAddress userAddress : userAddressList){
            System.out.println(userAddress.getUserAddress());
        }
        return userAddressList;

    }
}

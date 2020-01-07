package com.magic.gmall.service.impl;

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

    @Autowired
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

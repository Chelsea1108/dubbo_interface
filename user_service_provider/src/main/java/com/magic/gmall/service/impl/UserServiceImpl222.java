package com.magic.gmall.service.impl;

import com.magic.gmall.bean.UserAddress;
import com.magic.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author Chelsea
 * @Date 2020/1/2 18:11
 */

public class UserServiceImpl222 implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("userService ===============2222===========");
        UserAddress address1 = new UserAddress(1,"北京故宫","1","","","");
        UserAddress address2 = new UserAddress(2,"深圳福田","1","","","");

        return Arrays.asList(address1,address2);
    }
}

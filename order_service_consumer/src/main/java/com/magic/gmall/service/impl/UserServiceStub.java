package com.magic.gmall.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.magic.gmall.bean.UserAddress;
import com.magic.gmall.service.UserService;

import java.util.List;

/**
 * @Description
 * @Author Chelsea
 * @Date 2020/1/3 12:45
 */

public class UserServiceStub implements UserService {

    private final UserService userService;

    public UserServiceStub(UserService userService) {
        super();
        this.userService = userService;
    }

    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("=========stub==========");
        if (!StringUtils.isEmpty(userId)) {

            return userService.getUserAddressList(userId);
        }
        return null;
    }
}

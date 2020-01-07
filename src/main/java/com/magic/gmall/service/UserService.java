package com.magic.gmall.service;

import com.magic.gmall.bean.UserAddress;

import java.util.List;

/**
 * @Description 用户服务
 * @Author Chelsea
 * @Date 2020/1/2 18:09
 */

public interface UserService {

    public List<UserAddress> getUserAddressList(String userId);
}

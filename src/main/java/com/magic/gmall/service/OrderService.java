package com.magic.gmall.service;

import com.magic.gmall.bean.UserAddress;

import java.util.List;

/**
 * @Description
 * @Author Chelsea
 * @Date 2020/1/2 18:17
 */

public interface OrderService {

    public List<UserAddress> initOrder(String userId);
}

package com.magic.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.magic.gmall.bean.UserAddress;
import com.magic.gmall.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author Chelsea
 * @Date 2020/1/2 18:11
 */

@Component
@Service//dubbo注解，暴露服务，xml不用这个
public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1,"北京故宫","1","","","");
        UserAddress address2 = new UserAddress(2,"深圳福田","1","","","");

        return Arrays.asList(address1,address2);
    }
}

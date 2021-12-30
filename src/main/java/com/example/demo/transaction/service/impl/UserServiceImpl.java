package com.example.demo.transaction.service.impl;

import com.example.demo.transaction.entity.UserDomain;
import com.example.demo.transaction.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author: zenghai.li
 * @Date: 2021/12/30
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public Integer addUser(UserDomain userDomain) {

        return userDomain.getUserId() == 1 ? 1 : 0;
    }
}

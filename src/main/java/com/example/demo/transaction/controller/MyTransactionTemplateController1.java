package com.example.demo.transaction.controller;

import com.example.demo.transaction.entity.UserDomain;
import com.example.demo.transaction.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@Slf4j
@RequestMapping("test1")
public class MyTransactionTemplateController1 {


    @Autowired
    private TransactionTemplate transactionTemplate;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/addUser",produces = "application/json;charset=UTF-8")
    @Transactional(rollbackFor = Exception.class)
    public void addUser() {

        UserDomain user1 = new UserDomain();
        user1.setUserId(2);
        user1.setUserName("andy");
        user1.setPassword("andy");
        user1.setPhone("15875571889");

        UserDomain user2 = new UserDomain();
        user2.setUserId(1);
        user2.setUserName("edgar");
        user2.setPassword("root");
        user2.setPhone("13607961855");

        List<UserDomain> userDomainList = new ArrayList<>();
        userDomainList.add(user1);
        userDomainList.add(user2);

        for (UserDomain user : userDomainList) {
            int count = userService.addUser(user);
            if (count == 1) {
                log.info("userId 为:" + user.getUserId() + " 添加成功");
            } else {
                log.info("userId 为:" + user.getUserId() + " 添加失败");
            }
        }
    }

}

package com.example.demo.security.service;

import com.example.demo.security.dto.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/05/11
 */
public class UserService implements UserDetailsService {
    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = new User();
        user.setUsername("zzz");
        user.setPassword("777");


        return user;
    }
}

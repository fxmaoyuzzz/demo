package com.example.demo.security.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.example.demo.security.dto.User;
import org.springframework.security.core.Authentication;

import java.util.Date;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/05/11
 */
public class JwtTokenProvider {

    private static final long JWT_EXPIRATION = 5 * 60 * 1000L; // 五分钟过期

    public static final String TOKEN_PREFIX = "Bearer "; // token 的开头字符串

    private String jwtSecret = "zzz777";


    public String generateToken(Authentication authentication) {
        User userPrincipal = (User) authentication.getPrincipal(); // 获取用户对象
        Date expireDate = new Date(System.currentTimeMillis() + JWT_EXPIRATION); // 设置过期时间
        try {
            Algorithm algorithm = Algorithm.HMAC256(jwtSecret); // 指定加密方式
            return JWT.create()
                    .withExpiresAt(expireDate)
                    .withClaim("username", userPrincipal.getUsername())
                    .sign(algorithm); // 签发 JWT
        } catch (JWTCreationException jwtCreationException) {
            return null;
        }
    }

}

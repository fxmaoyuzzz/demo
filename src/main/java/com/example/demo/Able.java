package com.example.demo;

import lombok.Data;

/**
 * @author: fxmaoyuzzzz
 * @Date: 2021/12/27
 * @Description:
 */
@Data
public class Able {

    private Integer id;

    private Integer num;


    public Able(Integer id, Integer num) {
        this.id = id;
        this.num = num;
    }

    public Able() {

    }
}

package com.example.demo.entity;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

/**
 * @author: fxmaoyuzzzz
 * @Date: 2021/12/27
 * @Description:
 */
@Data
public class Able {

    private Integer id;

    @NotBlank(message = "num 不能为空")
    private Integer num;


    private String name;


    public Able(Integer id, Integer num) {
        this.id = id;
        this.num = num;
    }

    public Able() {

    }

    //@Override
    //public boolean equals(Object o) {
    //    if (this == o) return true;
    //    if (o == null || getClass() != o.getClass()) return false;
    //    Able able = (Able) o;
    //    return id.equals(able.id + num);
    //}
    //
    //@Override
    //public int hashCode() {
    //    return Objects.hash(id+num);
    //}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Able)) return false;
        Able able = (Able) o;
        return id.equals(able.id) && num.equals(able.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num);
    }
}

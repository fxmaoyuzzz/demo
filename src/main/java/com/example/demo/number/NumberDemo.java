package com.example.demo.number;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.StrUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: zenghai.li
 * @Date: 2021/12/30
 * @Description:
 */
public class NumberDemo {

    public static void main(String[] args) {
        //Integer a = 0;
        //
        //Double b = a.doubleValue();
        //System.out.println(b);
        //
        //double c = 10;
        //double d = 3;
        //
        //double div = NumberUtil.div(d, c);
        //
        //System.out.println(div);

    //    merge test
    //
    //    String a = "[";
    //    String sub = StrUtil.sub(a, 1, -1);
    //    System.out.println(sub);

        //double a = 1.23756;
        //String s = NumberUtil.roundStr(a, 2);
        //a = Double.parseDouble(s);
        //System.out.println();
        //BigDecimal bigDecimal = new BigDecimal(2.34567);
        //BigDecimal scale = bigDecimal.setScale(3, BigDecimal.ROUND_HALF_UP);
        //System.out.println(scale);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(1.343d);
        doubles.add(2.794d);
        doubles.add(3.527d);
        doubles.add(4.016d);
        //List<String> collect = doubles.stream().map(item -> NumberUtil.roundStr(item, 1)).collect(Collectors.toList());
        //for (Double item : doubles) {
        //    item = Double.valueOf(NumberUtil.roundStr(item, 2));
        //}
        //System.out.println(doubles);
        Iterator<Double> iterator = doubles.iterator();
        while (iterator.hasNext()) {
            Double next =  iterator.next();
            
        }
        HashMap<Object, Object> map = new HashMap<>();
        map.put("haha", "aaa");

    }
}

package com.example.demo.array;


import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @Author Flandre Lee
 * @Date 2022/3/14 09:23
 */
public class Demo {

    public static void main(String[] args) {

        String s = "[{\"answer\":\"的撒打算打算\",\"question\":\"总结测试 33\",\"isNull\":1,\"tips\":\"33333\"},{\"answer\":\"的撒旦撒旦打撒\",\"question\":\"总结\",\"isNull\":1,\"tips\":\"结节结节结节\"},{\"answer\":\"大大撒旦撒旦\",\"question\":\"合格\",\"isNull\":0,\"tips\":\"请输入\"}]";
        if (JsonUtils.isJSON(s)) {
            String summaryJson = s;
            List<SubmitCheckSummaryVo> list = new ArrayList<>();
            list = JSON.parseArray(summaryJson, SubmitCheckSummaryVo.class);
            StringBuilder builder = new StringBuilder();
            for (int num = 0; num < list.size(); num++) {
                builder.append(num + 1 + "、" + list.get(num).getAnswer() + ":\n" + list.get(num).getQuestion() + "\n");
            }
            System.out.println(builder);
        }
    }
}

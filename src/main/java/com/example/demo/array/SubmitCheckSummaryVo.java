package com.example.demo.array;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author Flandre Lee
 * @Date 2022/3/15 15:44
 */
@Data
public class SubmitCheckSummaryVo implements Serializable {
    private static final long serialVersionUID = -3215329021546482545L;

    private String answer;
    private String question;
    private Integer isNull;
    private String tips;
}

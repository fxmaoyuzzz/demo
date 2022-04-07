package com.example.demo.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/06
 */
public class StuEvent extends ApplicationEvent {

    private Student student;

    public StuEvent(Student source) {
        super(source);
        this.student = source;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

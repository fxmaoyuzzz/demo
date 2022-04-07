package com.example.demo.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/06
 */
@Service
public class ListenerMain {

    @Autowired
    private  ApplicationEventPublisher publisher;

    public Student addStu(Student student){
        //Student student = new Student();
        //student.setName("zzz");
        //student.setAge(20);
        publisher.publishEvent(new StuEvent(student));
        return student;
    }
}

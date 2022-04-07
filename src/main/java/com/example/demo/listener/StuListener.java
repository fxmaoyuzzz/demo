package com.example.demo.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/06
 */
@Component
public class StuListener {

    @EventListener
    public void modifyStuListener(StuEvent event){
        System.out.println("学生信息被修改");
    }

    //@Override
    //public void publishEvent(ApplicationEvent event) {
    //    ApplicationEventPublisher.super.publishEvent(event);
    //}
}

package com.example.demo;

import com.example.demo.listener.ListenerMain;
import com.example.demo.listener.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void addTest(){
        ListenerMain listenerMain = new ListenerMain();
        Student student = new Student();
        student.setName("zzz");
        student.setAge(20);
        listenerMain.addStu(student);
    }

}

package com.naveen.SpringBootDemo.model;

import org.springframework.stereotype.Component;

@Component
public class Cpu {
    public void connect(){
        System.out.println("CPU connected");
    }
}

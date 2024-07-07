package com.naveen.SpringBootDemo.model;

public class Desktop implements Computer{

    @Override
    public void compile() {
        System.out.println("Desktop Compiling...");
    }
}

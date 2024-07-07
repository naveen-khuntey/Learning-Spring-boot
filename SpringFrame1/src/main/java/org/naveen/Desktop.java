package org.naveen;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    public Desktop() {
        System.out.println("Desktop object Created");
    }

    @Override
    public void connecting() {
        System.out.println("Desktop connecting..");
    }

    @Override
    public void compile() {
        System.out.println("Desktop Compiling..");
    }
}

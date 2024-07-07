package org.naveen;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Scope("prototype")
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop object Created");
    }

    @Override
    public void connecting(){
        System.out.println("Laptop connecting..");
    }
    @Override
    public void compile(){
        System.out.println("Laptop Compiling..");
    }
}

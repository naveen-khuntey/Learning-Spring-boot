package org.naveen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
//    @Qualifier("com2")
    private Computer com;

    @Value("21")
    private int age;

    public Alien() {
        System.out.println("Alien Object Created");
    }

    public Alien(Computer com, int age) {
        this.com = com;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Programming..");
        com.compile();
    }
}

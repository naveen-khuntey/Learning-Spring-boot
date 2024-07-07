package com.naveen.SpringBootDemo.repository;

import com.naveen.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Laptop Added successfully");
    }
}

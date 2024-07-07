package com.naveen.SpringBootDemo.service;

import com.naveen.SpringBootDemo.model.Laptop;
import com.naveen.SpringBootDemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepository repo;
    public void addLaptop(Laptop lap){
        repo.save(lap);
    }
    public boolean isGoodforProg(Laptop lap){
        return true;
    }
}

package org.naveen.config;

import org.naveen.Alien;
import org.naveen.Computer;
import org.naveen.Desktop;
import org.naveen.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.naveen")
public class AppConfig {

//    @Bean(name = "alien")
//    public Alien alien(@Autowired Computer com){ //@Qualifier("com2")
//        Alien obj = new Alien();
//        obj.setAge(21);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean(name = {"com2","desktop1","beast"})
////    @Scope("prototype") // every time new object
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}

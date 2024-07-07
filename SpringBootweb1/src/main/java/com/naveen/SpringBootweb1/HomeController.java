package com.naveen.SpringBootweb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(int num1, @RequestParam("num2") int n2, ModelAndView mv){
        int res = num1 + n2;
        mv.addObject("result",res);
        mv.setViewName("result");
        return mv;
    }
}

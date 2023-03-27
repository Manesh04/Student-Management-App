package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("homepage")
    public String showHomePage(){
        System.out.println("Main Controller");
        System.out.println("This is display method");
        return "index";
    }
}

package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //this annotation already includes @Component
public class HomeController {


    @RequestMapping("/home") // "/home" is end point.
    public String getHomePage(){ //which end point? ex: www.amazon.com/login
        return "home.html";
    }


    @RequestMapping // if we put nothing after localhost:8080 or put / localhost:8080/ home html will be displayed as default
    public String getHomePage2(){
        return "home.html";
    }

    @RequestMapping({"/apple", "/orange"})
    public String getHomePage3(){
        return "home.html";
    }


    @RequestMapping("/nihan")
    public String getHomePage4(){ //method name does not mather
        return "nihan.html";
    }


}

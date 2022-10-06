package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController{

    @RequestMapping("/welcome")
    public String homePage(Model model) { //to execute a method from Model interface we passed the reference as parameter
        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        return "student/welcome"; //we are not putting .html for thymeleaf
    }
}

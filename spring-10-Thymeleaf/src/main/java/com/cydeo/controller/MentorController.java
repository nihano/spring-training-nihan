package com.cydeo.controller;


import com.cydeo.model.Mentor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mentor")
public class MentorController {

    @GetMapping("/register") //localhost:8080/mentor/register
    public String register(Model model) {

        model.addAttribute("mentor", new Mentor());

        return "mentor/mentor-register";
    }


}

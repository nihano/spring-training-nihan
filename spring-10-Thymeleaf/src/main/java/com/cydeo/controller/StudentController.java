package com.cydeo.controller;


import com.cydeo.bootstrap.DataGenerator;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("student")
public class StudentController {

    //method = RequestMethod.GET is default we do not need to type. this is to retrieve the page.
    //@RequestMapping(value = "/register", method = RequestMethod.GET) //localhost:8080/student/register
    @GetMapping("/register") //this is same with @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createStudent());


        return "student/register";
    }

    //Post==> when we search something etc. check class notes.
    //@RequestMapping(value = "/welcome", method = RequestMethod.POST) //localhost:8080/student/welcome
    @PostMapping("/welcome")
    public String welcome(@RequestParam String name){

        System.out.println(name);
        return "student/welcome";
    }
}

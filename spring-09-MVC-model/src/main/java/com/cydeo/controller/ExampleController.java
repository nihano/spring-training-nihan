package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExampleController {

    @RequestMapping("/something")
    public String exampleView(@RequestParam String nihan, Model model){

        model.addAttribute("make", nihan);

        return "example/example-info";
    }
}

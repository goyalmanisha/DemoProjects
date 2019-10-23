package com.ttn.mongodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {

    @GetMapping("/greet")
    public ModelAndView greet () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greet");
        return modelAndView;
    }

}

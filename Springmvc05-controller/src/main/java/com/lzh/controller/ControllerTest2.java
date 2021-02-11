package com.lzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {

    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg","ControllerTest2") ;
        return "test" ;
    }

    @RequestMapping("/t3")
    public String test2(Model model){
        model.addAttribute("msg","ControllerTest3") ;
        return "test" ;
    }
}

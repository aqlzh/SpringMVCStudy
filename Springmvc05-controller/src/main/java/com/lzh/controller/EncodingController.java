package com.lzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {

    @GetMapping("/e/t1")
    public String test1(String name , Model model){
        System.out.println(name);
         model.addAttribute("msg",name) ;
         return  "test" ;
    }
}

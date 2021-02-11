package com.lzh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/t1")
     public String test(){
         System.out.println("TestController==>test() 执行");
         return "ok" ;
     }
}

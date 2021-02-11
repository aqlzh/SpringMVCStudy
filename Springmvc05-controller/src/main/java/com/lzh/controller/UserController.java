package com.lzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public  String test1(String name, Model model){
      // 接受前端参数
        System.out.println("接受到的前端参数为"+name);

        // 将返回的结果传递给前端，model
        model.addAttribute("msg",name);

        //视图跳转
        return "test" ;
    }
}

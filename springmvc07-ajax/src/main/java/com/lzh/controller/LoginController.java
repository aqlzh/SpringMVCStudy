package com.lzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/main")
    public String main() {
        return "main";
    }


    @RequestMapping("/goLogin")
    public String login() throws Exception {
        return "login";
    }

    //登陆提交
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String pwd) throws Exception {
        // 向session记录用户身份信息
//        System.out.println("接收前端==="+username);
//        session.setAttribute("user", username);
//        return "success";
        session.setAttribute("userLogin",username);
        return "main" ;
    }

    //退出登陆
    @RequestMapping("goOut")
    public String logout(HttpSession session) throws Exception {
        // session 过期
        session.invalidate();
        return "login";
    }
}

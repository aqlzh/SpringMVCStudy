package com.lzh.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();


         // 以上为固定代码，以下为业务
        //封装对象，放在ModelAndView中。Model
        String result ="HelloSpringmvcLzh" ;
        mv.addObject("msg",result);

        //封装要跳转的视图，放在ModelAndView中
        mv.setViewName("test"); //: /WEB-INF/jsp/hello.jsp
        return mv;
    }

}


package com.lzh.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerTest implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
         ModelAndView mv= new ModelAndView() ;

       mv.addObject("msg","ControllerTest") ;
       mv.setViewName("hello");
        return null;
    }
}

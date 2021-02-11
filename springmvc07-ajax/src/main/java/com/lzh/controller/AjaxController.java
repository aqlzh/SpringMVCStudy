package com.lzh.controller;

import com.lzh.pojo.User;
import com.sun.net.httpserver.HttpServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String  test(){
        return "test" ;
    }
    @RequestMapping("/a1")
    public void a1(String name , HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if("lzh".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() {
      List<User> userlist = new ArrayList<User>() ;

      userlist.add(new User("lzh1",1,"m")) ;
      userlist.add(new User("lzh2",2,"f")) ;
      userlist.add(new User("lzh3",3,"m")) ;
      return userlist ;
    }

    @RequestMapping("/a3")
    public String ajax3(String name,String pwd){
        String msg = "";
        //模拟数据库中存在数据
        if (name!=null){
            if ("admin".equals(name)){
                msg = "OK";
            }else {
                msg = "用户名输入错误";
            }
        }
        if (pwd!=null){
            if ("123456".equals(pwd)){
                msg = "OK";
            }else {
                msg = "密码输入有误";
            }
        }
        return msg; //由于@RestController注解，将msg转成json格式返回
    }

}

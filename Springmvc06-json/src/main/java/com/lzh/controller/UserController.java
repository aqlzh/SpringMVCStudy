package com.lzh.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lzh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    @ResponseBody    // 不会执行试图解析器，直接返回一个字符串
    public  String json1() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper() ;
        //  创建一个对象
        User user = new User("LZH",3,"男") ;

        String str = mapper.writeValueAsString(user) ;   // 注意抛出异常
        return  str;
    }

    @RequestMapping("/j2")
    public String json2(){
        List<User> userlist = new ArrayList<User>();
        User user1 = new User("LZH1",1,"男");
        User user2 = new User("LZH2",1,"男");
        User user3 = new User("LZH3",1,"男");
        User user4 = new User("LZH4",1,"男");
        User user5 = new User("LZH5",1,"男");
        userlist.add(user1);
        userlist.add(user2);
        userlist.add(user3);
        userlist.add(user4);
        userlist.add(user5);

        String string  = JSON.toJSONString(userlist) ;
        return string ;
    }
}

package com.example.demo.controller;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import com.example.demo.model.user;
import com.example.demo.model.userService;

@Controller
@RequestMapping("/User")
public class UserController {

    // @Autowired
    // userService userService;
    //http://localhost:8080/User/list2
    @RequestMapping("/list2")
    public String userList2(ModelMap model) throws Exception {
        List<user> ls=userService.userList(); 
        // model.addAttribute("hello","Hello, Spring Boot!");
        // model.addAttribute("userList", ls);
        model.put("hello","Hello, Spring Boot,ok!");
        model.put("userList", ls);
        
        return "User/list2.html";
    }
}
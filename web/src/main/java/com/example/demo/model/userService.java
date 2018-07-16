package com.example.demo.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Mapper
@Service
public class userService {
    public static List<user> userList(){
        List<user> ls=new ArrayList<user>();
        user u=new user();
        u.setid(1);
        u.setname("12");
     
        user uu=new user();
        uu.setid(2);
        uu.setname("122");

        ls.add(u);
        ls.add(uu);
        return ls;
    }
}
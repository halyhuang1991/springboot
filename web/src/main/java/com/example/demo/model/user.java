package com.example.demo.model;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public class user{
    public int id;
    public String name;
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
}

package com.example.demo;



import java.util.List;

import com.example.demo.model.user;
import com.example.demo.model.userService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
// @SpringBootApplication
 @MapperScan(value = "com.example.demo.model.*")
public class DemoApplication {

	public static void main(String[] args) {
		//List<user> ls=userService.userList(); 
		SpringApplication.run(DemoApplication.class, args);
	}
}

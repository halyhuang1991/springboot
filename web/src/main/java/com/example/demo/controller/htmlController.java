package com.example.demo.controller;
// import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.*;  
import org.springframework.web.bind.annotation.*; 
@Controller
public class htmlController {
	@GetMapping("/html")
	public String html() {
		return "/index.html";
	} 
	@GetMapping("/index")
	public String index() {
		return "redirect:/index.html";
    } 
}
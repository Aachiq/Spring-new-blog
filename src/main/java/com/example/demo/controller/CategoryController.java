package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories") // http://localhost:8080/users
public class CategoryController {
	
	 @GetMapping()
	 public String getUsers() {
		 return "get users called";
	 }
}

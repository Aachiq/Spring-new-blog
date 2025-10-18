package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("/categories") // http://localhost:8080/users
public class CategoryController {
	
	 @Autowired
	 private CategoryService categoryService;
	
	 @GetMapping()
	 public List<Category> getCategories() {
		 return categoryService.getAllCategories();
	 }
}

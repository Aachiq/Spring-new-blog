package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	 
	// GET /categories/{id} -> get category by ID
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }
    
    // POST /categories/search
    @PostMapping("/search")
    public Category getCategoryByName(@RequestBody Map<String, String> body) {
        String name = body.get("name"); // get "name" from JSON as req.body.name in nodejs
        Category foundCategory = categoryService.getCategoryByName(name);
        return foundCategory; // null if not found
    }
    
    // GET /categories/count -> get total number of categories
    @GetMapping("/count")
    public Long getCountCategories() {
    	return categoryService.getCountCategories();
    }
    
	 
}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> getAllCategories() {
		 return categoryRepository.findAll();
	}
	
	// Get category by ID (returns null if not found)
    public Category getCategoryById(Long id) {
        Category foundCategory = null;

        if(categoryRepository.existsById(id)) {
            foundCategory = categoryRepository.findById(id).get();
        }

        // You can now use foundCategory for other processing before returning
        return foundCategory; // returns null if not found
    }
    
    // Get category by Name (returns null if not found)
    public Category getCategoryByName(String name) {
        return categoryRepository.findByName(name);
    }
    
    // keep also this syntax store result in variable to check in null++
    //public Category getCategoryByName(String name) {
    //    Category foundCategory = categoryRepository.findByName(name);
    //    return foundCategory; // will be null if not found
    //}
    
    public Long getCountCategories() {
    	return categoryRepository.count();
    }
    
}

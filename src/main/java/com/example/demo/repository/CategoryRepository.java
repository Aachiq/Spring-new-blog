package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
    // No extra code needed, JpaRepository provides findAll() and findById()
	
	// Custom method to find a category by name
    Category findByName(String name);
}

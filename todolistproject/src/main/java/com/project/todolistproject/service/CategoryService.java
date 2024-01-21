package com.project.todolistproject.service;

import com.project.todolistproject.entity.Category;
import com.project.todolistproject.repository.CategoryRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Service component for Category entity
 */
@Component
public class CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService( CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category save(Category category){
        return categoryRepository.save(category);
    }
}

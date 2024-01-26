package com.project.todolistproject.controller;

import com.project.todolistproject.entity.Category;
import com.project.todolistproject.link.CategoryLink;
import com.project.todolistproject.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    public ResponseEntity<?> getAllCategories() {
        log.info("CategoryController: get all categories");
        List<Category> listOfCategories = categoryService.getAllCategories();
        return ResponseEntity.ok(listOfCategories);
    }

    @PostMapping("/categories")
    public ResponseEntity<?> saveCategory(@RequestBody Category category){
        log.info("CategoryController: save the new category");
        Category newCategory = categoryService.save(category);
        return ResponseEntity.ok(newCategory);
    }

}

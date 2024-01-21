package com.project.todolistproject.repository;

import com.project.todolistproject.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

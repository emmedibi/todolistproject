package com.project.todolistproject.repository;

import com.project.todolistproject.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface TaskRepository extends JpaRepository<Task, Long> {
}

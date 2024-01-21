package com.project.todolistproject.service;

import com.project.todolistproject.entity.Task;
import com.project.todolistproject.repository.TaskRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Service component for Task entity
 */
@Component
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task save(Task task){
        return taskRepository.save(task);
    }
}

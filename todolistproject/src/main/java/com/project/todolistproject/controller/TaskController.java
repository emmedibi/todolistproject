package com.project.todolistproject.controller;

import com.project.todolistproject.entity.Category;
import com.project.todolistproject.entity.Task;
import com.project.todolistproject.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        log.info("TaskController: get all tasks");
        return (List<Task>) taskService.getAllTasks();
    }

    @PostMapping("/tasks")
    public Task saveTask(@RequestBody Task task, @RequestBody Category choosenCategory){
        log.info("TaskController: save the new task");
        // Add the category attribute to the new task
//        task.setCategory(choosenCategory);
        return taskService.save(task);
    }
}

package com.project.todolistproject.controller;

import com.project.todolistproject.entity.Category;
import com.project.todolistproject.entity.Task;
import com.project.todolistproject.link.TaskLink;
import com.project.todolistproject.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/task/")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping(path= TaskLink.LIST_TASKS)
    public ResponseEntity<?> getAllTasks() {
        log.info("TaskController: get all tasks");
        List<Task> listOfTasks = taskService.getAllTasks();
        return ResponseEntity.ok(listOfTasks);
    }

    @PostMapping(path= TaskLink.ADD_TASK)
    public ResponseEntity<?> saveTask(@RequestBody Task task, @RequestBody Category choosenCategory){
        log.info("TaskController: save the new task");
        // Add the category attribute to the new task
//        task.setCategory(choosenCategory);
        Task newTask = taskService.save(task);
        return ResponseEntity.ok(newTask);
    }
}

package com.project.todolistproject;

import com.project.todolistproject.entity.Task;
import com.project.todolistproject.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class TodolistprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistprojectApplication.class, args);
	}

}

package com.project.todolistproject.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

/**
 *Entity that represents the tasks to be done by the user
 */
@Entity
@Data

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull()
    @NotEmpty(message = "Entity name must be provided.")
    private String title;

    @NotNull()
    @NotEmpty(message = "Entity description must be provided.")
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull
    private Timestamp start_date;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp end_date;

    @NotNull()
    private Boolean is_repeated;

    @Min(1)
    private Integer pace;

    private String status;

    /**
     * Relation between Task and Category entity
     */
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}

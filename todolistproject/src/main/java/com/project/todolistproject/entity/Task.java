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
    @Column
    private Long id;

    @Column
    @NotNull()
    @NotEmpty(message = "Entity name must be provided.")
    private String title;

    @Column
    @NotNull()
    private String description;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull
    private Timestamp start_date;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp end_date;

    @Column
    @NotNull()
    private Boolean is_repeated;

    @Column
    private Integer pace;

    @Column
    @NotNull()
    private String status;

    /**
     * Relation between Task and Category entity
     */
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}

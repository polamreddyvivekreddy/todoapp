package com.todocompany.todoapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDoTask {
    @Id
    private Integer toDoTaskId;
    private String toDoTaskName;
    private String toDoTaskStatus;
}

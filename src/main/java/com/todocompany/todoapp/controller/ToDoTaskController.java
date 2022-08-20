package com.todocompany.todoapp.controller;


import com.todocompany.todoapp.model.ToDoTask;
import com.todocompany.todoapp.service.ToDoTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todoapp")
@RequiredArgsConstructor
public class ToDoTaskController {

    private final ToDoTaskService toDoTaskService;

    @GetMapping("/view-all-tasks")
    public List<ToDoTask> viewAllTasks() {
        return toDoTaskService.viewAllTasks();
    }

    @GetMapping("/view-task-by-id")
    public ToDoTask viewTaskById(Integer taskId) {
        return toDoTaskService.viewTaskById(taskId);
    }

    @PostMapping("/create-task")
    public String createTask(Integer taskId, String taskName, String taskStatus) {
        return toDoTaskService.createTask(taskId, taskName, taskStatus);
    }

    @PutMapping("/update-task")
    public String updateTask(Integer taskId, String taskName, String taskStatus) {
        return toDoTaskService.updateTask(taskId, taskName, taskStatus);
    }

    @DeleteMapping("/delete-task")
    public String deleteTask(Integer taskId) {
        return toDoTaskService.deleteTask(taskId);
    }

}

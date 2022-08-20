package com.todocompany.todoapp.service;

import com.todocompany.todoapp.model.ToDoTask;
import com.todocompany.todoapp.repo.ToDoTaskRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoTaskService {
    private final ToDoTaskRepo toDoTaskRepo;

    public List<ToDoTask> viewAllTasks() {
        return toDoTaskRepo.findAll();
    }

    public ToDoTask viewTaskById(Integer taskId) {
        return toDoTaskRepo.findById(taskId).get();
    }

    public String createTask(Integer taskId, String taskName, String taskStatus) {
        if (toDoTaskRepo.existsById(taskId)) {
            return "Entry exists with this Id, please provide a new Id";
        }
        toDoTaskRepo.save(new ToDoTask(taskId, taskName, taskStatus));
        return "Task saved : " + taskId + "\n" + taskName + "\n" + taskStatus;
    }

    public String updateTask(Integer taskId, String taskName, String taskStatus) {
        if (toDoTaskRepo.existsById(taskId)) {
            toDoTaskRepo.save(new ToDoTask(taskId, taskName, taskStatus));
            return "Task saved : " + taskId + "\n" + taskName + "\n" + taskStatus;
        }
        return "Entry doesn't exist with this Id, please provide an existing Id to update";
    }

    public String deleteTask(Integer taskId) {
        if (toDoTaskRepo.existsById(taskId)) {
            toDoTaskRepo.deleteById(taskId);
            return "Task deleted : " + taskId;
        }
        return "Entry doesn't exist with this Id, please provide an existing Id to delete";
    }
}

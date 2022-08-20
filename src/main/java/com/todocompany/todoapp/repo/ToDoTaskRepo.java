package com.todocompany.todoapp.repo;

import com.todocompany.todoapp.model.ToDoTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoTaskRepo extends JpaRepository<ToDoTask, Integer> {

}

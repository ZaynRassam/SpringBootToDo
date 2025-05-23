package com.todoapp.todo.repositories;

import com.todoapp.todo.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByCompleted(boolean completed);
    List<Task> findByDueDateBefore(Date date);
    List<Task> findByDueDateAfter(Date date);
}

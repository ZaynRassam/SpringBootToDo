package com.todoapp.todo.dto;

import com.todoapp.todo.entities.Task;

import java.time.LocalDateTime;
import java.util.Date;

public class TaskDTO {

    private Long id;
    private String title;
    private boolean completed;
    private LocalDateTime createdAt;
    private Date dueDate;

    public TaskDTO() {
    }

    public TaskDTO(Task task){
        this.id = task.getId();
        this.title = task.getTitle();
        this.completed = task.isCompleted();
        this.createdAt = task.getCreatedAt();
        this.dueDate = task.getDueDate();
    }

    public TaskDTO(Long id, String title, boolean completed, LocalDateTime createdAt, Date dueDate, Long userId) {
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.createdAt = createdAt;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}

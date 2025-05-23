package com.todoapp.todo.entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "todo_tasks")
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private boolean completed;

    @Column(name="created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Temporal(TemporalType.DATE)
    @Column(name = "due_date")
    private Date dueDate;

    public Task() {
    }

    public Task(Long id, String title, boolean completed, Date dueDate) {
        this.id = id;
        this.title = title;
        this.completed = completed;
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



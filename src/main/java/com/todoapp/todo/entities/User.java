package com.todoapp.todo.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "todo_users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Task> tasks = new ArrayList<>();

    public User() {
    }

    public User(Long id, String username, List<Task> tasks) {
        this.id = id;
        this.username = username;
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}

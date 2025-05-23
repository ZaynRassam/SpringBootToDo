package com.todoapp.todo.repositories;

import com.todoapp.todo.entities.Task;
import com.todoapp.todo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

}

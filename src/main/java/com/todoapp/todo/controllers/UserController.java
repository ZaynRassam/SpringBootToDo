package com.todoapp.todo.controllers;

import com.todoapp.todo.dto.UserDTO;
import com.todoapp.todo.entities.User;
import com.todoapp.todo.repositories.UserRepository;
import com.todoapp.todo.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers().stream()
                .map(UserDTO::new).toList();
    }

    @PostMapping
    public UserDTO createUser(@Valid @RequestBody UserDTO userDTO){
        return new UserDTO(userService.createUser(new User(userDTO)));
    }
}

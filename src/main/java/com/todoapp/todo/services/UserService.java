package com.todoapp.todo.services;

import com.todoapp.todo.dto.TaskDTO;
import com.todoapp.todo.dto.UserDTO;
import com.todoapp.todo.entities.User;
import com.todoapp.todo.repositories.TaskRepository;
import com.todoapp.todo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User getUserByID(Long userId){
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public List<User> getAllUsers(){
        return userRepository.findAll().stream()
                .map(user -> new User(
                        user.getId(),
                        user.getUsername(),
                        user.getTasks())).toList();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }
}

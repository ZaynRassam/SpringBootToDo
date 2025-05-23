package com.todoapp.todo.services;

import com.todoapp.todo.entities.User;
import com.todoapp.todo.repositories.TaskRepository;
import com.todoapp.todo.dto.TaskDTO;
import com.todoapp.todo.entities.Task;
import com.todoapp.todo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository, UserRepository userRepository){
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task createTask(TaskDTO taskDTO){
        Task task = new Task();
        task.setTitle(taskDTO.getTitle());
        task.setCompleted(taskDTO.isCompleted());
        task.setDueDate(taskDTO.getDueDate());
        task.setUser(userRepository.findById(taskDTO.getUserId())
                        .orElseThrow(() -> new RuntimeException("User not found")));
        taskRepository.save(task);
        return task;
    }
}

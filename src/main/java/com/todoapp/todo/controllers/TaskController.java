package com.todoapp.todo.controllers;

import com.todoapp.todo.dto.TaskDTO;
import com.todoapp.todo.services.TaskService;
import com.todoapp.todo.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<TaskDTO> getAllTasks(){
        return taskService.getAllTasks().stream().map(TaskDTO::new).toList();
    }

    @PostMapping
    public TaskDTO createTask(@RequestBody TaskDTO taskDTO){
        Task task = taskService.createTask(taskDTO);
        return new TaskDTO(task);
    }
}

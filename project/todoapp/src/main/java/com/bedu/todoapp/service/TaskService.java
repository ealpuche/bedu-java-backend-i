package com.bedu.todoapp.service;

import com.bedu.todoapp.model.Task;
import com.bedu.todoapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;


    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

    public void saveTask(Task task){
        taskRepository.save(task);
    }

    public void updateTask(Task task){
        taskRepository.save(task);
    }

    public Task getTask(Long id){
        return taskRepository.findById(id).orElse(null);
    }

    public Iterable<Task> getTasks(){
        return taskRepository.findAll();
    }

}

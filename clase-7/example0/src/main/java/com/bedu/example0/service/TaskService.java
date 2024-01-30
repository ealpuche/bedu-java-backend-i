package com.bedu.example0.service;

import com.bedu.example0.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {
    private List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    public List<Task> findAll() {
        return tasks;
    }

    public void addTask(Task task) {
        task.setId(nextId++);
        tasks.add(task);
    }

    public void deleteTask(Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }

    public void editTask(Long id, Task updatedTask) {
        tasks = tasks.stream().map(task -> {
            if (task.getId().equals(id)) {
                task.setTitle(updatedTask.getTitle());
                task.setCompleted(updatedTask.isCompleted());
            }
            return task;
        }).collect(Collectors.toList());
    }

    public Task findById(Long id) {
        return tasks.stream().filter(task -> task.getId().equals(id)).findFirst().orElse(null);
    }
}

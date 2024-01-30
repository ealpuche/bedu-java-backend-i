package com.bedu.todoapp.service;

import com.bedu.todoapp.model.Task;
import com.bedu.todoapp.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;


    @Test
    void whenSavingTask_thenRepositoryIsCalled() {
        Task task = new Task();
        task.setTitle("Test task");
        task.setDescription("Test description");
        task.setCompleted(false);
        task.setDueDate("2021-12-31");
        taskService.saveTask(task);
        verify(taskRepository).save(task);
    }

    @Test
    void whenUpdatingTask_thenRepositoryIsCalled() {
        Task task = new Task();
        task.setId(1L);
        task.setTitle("Test task");
        task.setDescription("Test description");
        task.setCompleted(false);
        task.setDueDate("2021-12-31");
        taskService.updateTask(task);
        verify(taskRepository).save(task);
    }

    @Test
    void whenDeletingTask_thenRepositoryIsCalled() {
        taskService.deleteTask(1L);
        verify(taskRepository).deleteById(1L);
    }

    @Test
    void whenGettingTask_thenRepositoryIsCalled() {
        taskService.getTask(1L);
        verify(taskRepository).findById(1L);
    }

    @Test
    void whenGettingTasks_thenRepositoryIsCalled() {
        taskService.getTasks();
        verify(taskRepository).findAll();
    }
}

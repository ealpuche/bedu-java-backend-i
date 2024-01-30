package com.bedu.todoapp.controller;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.bedu.todoapp.model.Task;
import com.bedu.todoapp.service.TaskService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

@WebMvcTest(TaskRestController.class)
@AutoConfigureMockMvc
public class TaskControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TaskService taskService;

    @Test
    public void whenGetAllTasks_thenReturnJsonArray() throws Exception {
        Task task1 = new Task();
        task1.setId(1L);
        task1.setTitle("Task 1");
        task1.setDescription("Description 1");
        task1.setCompleted(false);
        task1.setDueDate("2021-12-31");

        Task task2 = new Task();
        task2.setId(2L);
        task2.setTitle("Task 2");
        task2.setDescription("Description 2");
        task2.setCompleted(true);
        task2.setDueDate("2021-12-31");
        when(taskService.getTasks()).thenReturn(Arrays.asList(task1, task2));
        String expectedJson = "[{'id': 1, 'title': 'Task 1', 'description': 'Description 1', 'completed': false, 'dueDate': '2021-12-31'}, {'id': 2, 'title': 'Task 2', 'description': 'Description 2', 'completed': true, 'dueDate': '2021-12-31'}]";

        mockMvc.perform(get("/api/v1/tasks/"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(content().json(expectedJson));

        verify(taskService).getTasks();
    }

    @Test
    public void whenGetTask_thenReturnJson() throws Exception {
        Task task = new Task();
        task.setId(1L);
        task.setTitle("Task 1");
        task.setDescription("Description 1");
        task.setCompleted(false);
        task.setDueDate("2021-12-31");
        when(taskService.getTask(1L)).thenReturn(task);
        String expectedJson = "{'id': 1, 'title': 'Task 1', 'description': 'Description 1', 'completed': false, 'dueDate': '2021-12-31'}";

        mockMvc.perform(get("/api/v1/tasks/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(content().json(expectedJson));

        verify(taskService).getTask(1L);
    }


    @Test
    public void whenAddTask_thenReturnStatusOk() throws Exception {
        Task task = new Task();
        task.setTitle("Task 1");
        task.setDescription("Description 1");
        task.setCompleted(false);
        task.setDueDate("2021-12-31");
        ObjectMapper objectMapper = new ObjectMapper();
        String taskJson = objectMapper.writeValueAsString(task);

        mockMvc.perform(post("/api/v1/tasks/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(taskJson))
                .andExpect(status().isOk());

        verify(taskService).saveTask(any(Task.class));
    }

    @Test
    public void whenDeleteTask_thenReturnStatusOk() throws Exception {
        mockMvc.perform(delete("/api/v1/tasks/1"))
                .andExpect(status().isOk());

        verify(taskService).deleteTask(1L);
    }

    @Test
    public void whenUpdateTask_thenReturnStatusOk() throws Exception {
        Task task = new Task();
        task.setId(1L);
        task.setTitle("Task 1");
        task.setDescription("Description 1");
        task.setCompleted(false);
        task.setDueDate("2021-12-31");
        ObjectMapper objectMapper = new ObjectMapper();
        String taskJson = objectMapper.writeValueAsString(task);

        mockMvc.perform(put("/api/v1/tasks/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(taskJson))
                .andExpect(status().isOk());

        verify(taskService).updateTask(any(Task.class));
    }





}

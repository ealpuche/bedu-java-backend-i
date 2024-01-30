package com.bedu.todoapp.repository;

import com.bedu.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository<Task, Long> {
}

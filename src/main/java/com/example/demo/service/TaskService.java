package com.example.demo.service;
import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entity.Task;

public interface TaskService {

  // Add task
  public void addTask(Task task);

  // Delete task
  public void deleteTaskById(Long id);

  // Update task by id
  public void updateTaskById(Long id, Task task);

  // Get all tasks
  public List<Task> getAllTasks();

  // Delete task by id
  public void deleteTask(Long taskId);

  // Get task by page
  Page<Task> getAllTasksPage(int pageNo, int pageSize);

}

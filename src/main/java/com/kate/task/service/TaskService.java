package com.kate.task.service;

import com.kate.task.entity.Task;
import com.kate.task.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Date;

@Data
@Service
@AllArgsConstructor
public class TaskService {

    public TaskRepository taskRepository;

    public Iterable<Task> getTasksList ()
    {
        return taskRepository.findAll();
    }

    public Task addTask(Date startDate, Date endDate, String text) {
        Task task = Task.builder()
                .isDone(false)
                .endDate(endDate)
                .startDate(startDate)
                .text(text)
                .build();
        return taskRepository.save(task);
    }
}

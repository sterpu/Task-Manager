package com.kate.task.controllers;

import com.kate.task.entity.Task;
import com.kate.task.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Data
@AllArgsConstructor
public class TaskController {
    public TaskService taskService;

    public Iterable<Task> getTasks(Model model) {
        Iterable<Task> tasks = taskService.getTasksList();
        return tasks;
    }

    public Task addTask(Model model){
        Task task = taskService.addTask(new Date(), new Date(), "new task");
        model.addAttribute("add_task", task);
        return task;
    }

    public boolean deleteTask(Model model){
        System.out.println("wow!!!!!");
        return true;
    }
}

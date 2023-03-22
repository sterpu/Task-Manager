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

@Controller
@RestController
@Data
@AllArgsConstructor
public class TaskController {
    public TaskService taskService;

    @GetMapping("/get_tasks")
    public Iterable<Task> getTasks(Model model) {
        Iterable<Task> tasks = taskService.getTasksList();
        return tasks;
    }

    @GetMapping("/add_task")
    public String addTask(Model model){
        model.addAttribute("add_task", taskService.addTask(new Date(), new Date(), "ttttrtr" ));
        System.out.println("wow!!!!!");
        return "add_task";
    }

    @GetMapping("/delete_task")
    public boolean deleteTask(Model model){
        System.out.println("wow!!!!!");
        return true;
    }
}

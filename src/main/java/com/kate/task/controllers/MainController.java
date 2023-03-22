package com.kate.task.controllers;

import com.kate.task.entity.Task;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@AllArgsConstructor
public class MainController {
    public TaskController taskController;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/author")
    public String author(Model model) {
        model.addAttribute("title", "Авторы");
        return "author";
    }

    @GetMapping("/tasks")
    public String tasks(Model model) {
        model.addAttribute("name", "Задачи");
        Iterable<Task> tasks = taskController.getTasks(model);
        System.out.println(tasks);
       // model.addAttribute("tasks", taskController.getTasks(model));
        return "tasks";
    }

}
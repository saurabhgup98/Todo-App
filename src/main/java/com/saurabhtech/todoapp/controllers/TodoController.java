package com.saurabhtech.todoapp.controllers;

import com.saurabhtech.todoapp.entity.Todo;
import com.saurabhtech.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/list-todos")
    public String listAllTodos(ModelMap modelMap){
        List<Todo> todos = todoService.findUserByUsername("sa");
        modelMap.put("todos",todos);
        return "listTodos";
    }

    @GetMapping("/add-todo")
    public String showNewTodoPage(){
        return "todo";
    }

    @PostMapping("/add-todo")
//    public String addNewTodo(ModelMap modelMap, @RequestParam String description){
        public String addNewTodo(ModelMap modelMap,Todo todo){
        //String username = (String) modelMap.get("name"); // add login logic
        String username = "Saurabh";
        todoService.addToDo(username,todo.getDescription(), LocalDate.now().plusYears(2),false);
        return "redirect:list-todos";
    }
}

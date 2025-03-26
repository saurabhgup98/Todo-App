package com.saurabhtech.todoapp.service;

import com.saurabhtech.todoapp.entity.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

    static {
        todos.add
                (new Todo(++todosCount,"Telusko","Learn Java", LocalDate.now().plusYears(1)
                ,false));
        todos.add
                (new Todo(++todosCount,"Saurabh","Learn Devops", LocalDate.now().plusYears(2)
                        ,false));
        todos.add
                (new Todo(++todosCount,"Rashi","Learn Python", LocalDate.now().plusYears(3)
                        ,false));

    }

    public List<Todo> findUserByUsername(String username){
        return todos;
    }

    public void addToDo(String username, String description, LocalDate targetDate, boolean done){
        Todo todo = new Todo(++todosCount,username,description,targetDate,done);
        todos.add(todo);
    }
}

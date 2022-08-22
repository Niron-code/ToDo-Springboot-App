package com.codinativ.todolist.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @RequestMapping("/todos")
    public List<ToDo> getAllToDos(){
        return toDoService.getAllToDos();
    }

    @RequestMapping("/todos/{id}")
    public ToDo getToDo(@PathVariable Integer id){
        return toDoService.getToDo(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/todos")
    public void createToDo(@RequestBody ToDo toDo){
        toDoService.createToDo(toDo);
    }
}

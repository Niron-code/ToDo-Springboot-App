package com.codinativ.todolist.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    //Method Implementation
    public List<ToDo> getAllToDos(){
        List<ToDo> todos = new ArrayList<>();
        toDoRepository.findAll().forEach(todos::add);
        return todos;
    }

    public ToDo getToDo(Integer id) {
        return toDoRepository.findById(id).get();
    }

    public void createToDo(ToDo toDo) {
        toDoRepository.save(toDo);
    }

    public void updateToDo(Integer id, ToDo toDo) {
        toDoRepository.save(toDo);
    }

    public void deleteToDo(Integer id) {
        toDoRepository.deleteById(id);
    }
}

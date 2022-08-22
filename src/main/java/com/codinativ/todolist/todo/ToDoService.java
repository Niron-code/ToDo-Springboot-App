package com.codinativ.todolist.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ToDoService {

    //Variable declaration
    private List<ToDo> todos = new ArrayList<>(
            Arrays.asList(
                    new ToDo(1, "Task_1","Summary_1","desc_1"),
                    new ToDo(2, "Task_2","Summary_2","desc_2"),
                    new ToDo(3, "Task_3","Summary_3","desc_3"),
                    new ToDo(4, "Task_4","Summary_4","desc_4")
            )
    );

    //Method Implementation
    public List<ToDo> getAllToDos(){
        return todos;
    }

    public ToDo getToDo(Integer id) {
        return todos.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }

    public void createToDo(ToDo toDo) {
        todos.add(toDo);
    }
}

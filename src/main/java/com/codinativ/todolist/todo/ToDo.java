package com.codinativ.todolist.todo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ToDo {

    Integer id;
    String name;
    String summary;
    String description;
}

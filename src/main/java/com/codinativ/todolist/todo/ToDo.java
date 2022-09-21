package com.codinativ.todolist.todo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data @NoArgsConstructor @AllArgsConstructor
public class ToDo {

    @Id
    Integer id;
    String name;
    String summary;
    String description;
}

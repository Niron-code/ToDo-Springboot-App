package com.codinativ.todolist.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

    @RequestMapping("/hello")
    public String sayHello(){ return"Hello World"; }

    @RequestMapping("/love")
    public String sayLove(){ return "I love You di Pondaati"; }

    @RequestMapping("/add")
    public int add(){ return 24; }
    

}

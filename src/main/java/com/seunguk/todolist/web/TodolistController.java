package com.seunguk.todolist.web;

import com.seunguk.todolist.web.dto.TodolistResonseDto;
import org.springframework.web.bind.annotation.*;

@RestController
class TodolistController {
    @GetMapping("/hello")//
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public TodolistResonseDto TodolistDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new TodolistResonseDto(name, amount);
    }
}

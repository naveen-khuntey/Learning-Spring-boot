package com.naveen.todo_list.controller;

import com.naveen.todo_list.model.List1;
import com.naveen.todo_list.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000") //frontend url
@RestController
@RequestMapping("/api/")
public class ListController {

    @Autowired
    private ListService service;

    @GetMapping("/todo")
    public List<List1> getAllTodo(){
        return service.getAllTodos();
    }

    @GetMapping("/todo/{Id}")
    public ResponseEntity<List1> getTodo(@PathVariable("Id") Long Id){
        return service.getTodoById(Id);
    }

    @PostMapping("/todo")
    public List1 createTodo(@RequestBody List1 l){
        return service.createTodo(l);
    }

    @PutMapping("/todo/{Id}")
    public ResponseEntity<List1> updateTodo(@PathVariable Long Id, @RequestBody List1 l){
        return service.updateTodo(Id,l);
    }

    @DeleteMapping("/todo/{Id}")
    public ResponseEntity<Map<String, Boolean>> deleteTodo(@PathVariable Long Id){
        return service.deleteTodo(Id);
    }
}

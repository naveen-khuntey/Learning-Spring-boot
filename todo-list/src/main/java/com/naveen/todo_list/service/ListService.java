package com.naveen.todo_list.service;

import com.naveen.todo_list.exception.ResourceNotFoundException;
import com.naveen.todo_list.model.List1;
import com.naveen.todo_list.repository.ListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ListService {
    @Autowired
    private ListRepo repo;
    public List<List1> getAllTodos(){
        return repo.findAll();
    }

    public List1 createTodo(List1 l){
        return repo.save(l);
    }

    public ResponseEntity<List1> getTodoById(Long Id){
        List1 l = repo.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Todo not exist with id :" + Id));
        return ResponseEntity.ok(l);
    }

    public ResponseEntity<List1> updateTodo(Long Id,List1 l1){
        List1 l = repo.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Todo not exist with id :" + Id));
        l.setId(l1.getId());
        l.setText(l1.getText());
        List1 l2 = repo.save(l);
        return ResponseEntity.ok(l2);
    }

    public ResponseEntity<Map<String, Boolean>> deleteTodo(Long Id){
        List1 l = repo.findById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not exist with id :" + Id));

        repo.delete(l);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}

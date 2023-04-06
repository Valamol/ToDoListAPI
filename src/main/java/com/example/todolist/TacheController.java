package com.example.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/taches")
public class TacheController {

    @Autowired
    private TacheService tacheService;

    @GetMapping("/byUser/{id}")
    public ResponseEntity<List<Taches>> getTachesByUser (@PathVariable long id){
        System.out.println(tacheService.findByUser(id));
        System.out.println(id);
        return new ResponseEntity<List<Taches>>(tacheService.findByUser(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String>create(@RequestBody Taches taches){
        tacheService.create(taches);
        return ResponseEntity.ok("created");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String>delete(@PathVariable long id){
        tacheService.delete(id);
        return ResponseEntity.ok("deleted");
    }
}
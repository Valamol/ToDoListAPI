package com.example.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/public/taches")
public class TacheController {

    @Autowired
    private TacheRepository tacheRepository;
    @Autowired
    private TacheService tacheService;

    @PostMapping("/byUser")
    public ResponseEntity<List<Taches>> getTachesByUser (@RequestParam String user){
        return new ResponseEntity<List<Taches>>(tacheRepository.findByUser(user), HttpStatus.OK);
    }
    @PostMapping
    public Taches createTache(@RequestBody Taches taches) {
        return tacheRepository.save(taches);
    }
}
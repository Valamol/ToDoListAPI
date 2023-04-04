package com.example.todolist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/public/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Users> register(@RequestBody Users user) {
        Users newUser = userService.createUser(user);
        return ResponseEntity.ok(newUser);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> authenticate(@RequestBody Map<String, String> credentials) {
        String pseudo = credentials.get("pseudo");
        String mdp = credentials.get("mdp");
        Users user = userService.authenticate(pseudo, mdp);

        if (user != null) {
            Map<String, Object> response = new HashMap<>();
            response.put("status", "success");
            response.put("user", user);
            return ResponseEntity.ok(response);
        } else {
            Map<String, Object> response = new HashMap<>();
            response.put("status", "error");
            response.put("message", "Invalid pseudo or password");
            return ResponseEntity.badRequest().body(response);
        }
    }
}
package com.example.todolist;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "taches", schema = "public")
public class Taches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user", length = 25)
    private long user;
    @Column(name = "name", length = 15)
    private String name;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "time")
    private LocalTime timeF;
    @Column(name = "description", length = 300)
    private String description;

}

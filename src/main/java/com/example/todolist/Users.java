package com.example.todolist;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "users", schema = "public")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "pseudo", length = 15)
    private String pseudo;
    @Column(name = "mail", length = 30)
    private String mail;
    @Column(name = "mdp", length = 100)
    private String mdp;

    public String getPseudo() {
        return pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public String getMail() {
        return mail;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}

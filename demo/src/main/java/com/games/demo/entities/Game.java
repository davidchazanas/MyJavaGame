package com.games.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Game {
    private Boolean victory;
    
    @Id
    private Long Id;
    
    public Boolean getVictory() {
        return victory;
    }
    public void setVictory(Boolean victory) {
        this.victory = victory;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public Game() {
    }
}

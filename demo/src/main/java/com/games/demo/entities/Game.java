package com.games.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Game {
    private Boolean victory;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;


    private Long gold;

    private Long investedGold;
    
    public Long getGold() {
        return gold;
    }
    public void setGold(Long gold) {
        this.gold = gold;
    }
    public Long getInvestedGold() {
        return investedGold;
    }
    public void setInvestedGold(Long investedGold) {
        this.investedGold = investedGold;
    }
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

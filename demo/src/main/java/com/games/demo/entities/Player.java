package com.games.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player {
    @Id
    private Long id;
    private String name;
    private Long health;
    private int weapon;
    private int position_x;
    private int position_y;
    
    
    public Player() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getHealth() {
        return health;
    }
    public void setHealth(Long health) {
        this.health = health;
    }
    public int getWeapon() {
        return weapon;
    }
    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }
    public int getPosition_x() {
        return position_x;
    }
    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }
    public int getPosition_y() {
        return position_y;
    }
    public void setPosition_y(int position_y) {
        this.position_y = position_y;
    }
}

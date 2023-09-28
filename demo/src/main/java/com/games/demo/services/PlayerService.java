package com.games.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.games.demo.entities.Player;
import com.games.demo.repositories.PlayerRepository;

@Service
public class PlayerService {
    
    @Autowired
    PlayerRepository pRepository;


    private void MachucarPlayer(int dmg, Player p){
        p.setHealth(p.getHealth() - dmg);
    }
}

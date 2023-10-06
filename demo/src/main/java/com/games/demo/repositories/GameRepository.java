package com.games.demo.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.games.demo.entities.Game;

@Service
public class GameRepository implements IGameRepository{

    @Autowired
    GameRepositoryJPA gameRepositoryJPA;

    @Override
    public Game findById(Long gid) {
        return gameRepositoryJPA.findById(gid).orElseThrow();
    }

    @Override
    public Game save(Game g) {
        return gameRepositoryJPA.save(g);
    }
    
}

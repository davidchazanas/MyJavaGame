package com.games.demo.repositories;

import org.springframework.beans.factory.annotation.Autowired;

import com.games.demo.entities.Game;

public class GameRepositoryImpl implements IGameRepository{

    @Autowired
    GameRepository gameRepository;

    @Override
    public Game findById(Long gid) {
        // TODO Auto-generated method stub

        return gameRepository.findById(gid).orElseThrow();
    }

    @Override
    public Game save(Game g) {
        return gameRepository.save(g);
    }
    
}

package com.games.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import com.games.demo.entities.Game;

public class GameRepositoryTestImpl implements IGameRepository{
    private List<Game> games;

    public GameRepositoryTestImpl(){
        this.games = new ArrayList<Game>();
    }

    @Override
    public Game findById(Long gid) {
        return (games.stream().filter(game -> game.getId() == gid).findFirst()).orElse(null);
    }

    @Override
    public Game save(Game g) {
        games.add(g);
        return g;
    }


}

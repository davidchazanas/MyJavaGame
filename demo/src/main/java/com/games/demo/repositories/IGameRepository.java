package com.games.demo.repositories;

import com.games.demo.entities.Game;

public interface IGameRepository {
    public Game findById(Long gid);
    public Game save(Game g);
}

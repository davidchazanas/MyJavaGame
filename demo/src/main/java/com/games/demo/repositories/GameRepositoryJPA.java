package com.games.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.demo.entities.Game;

public interface GameRepositoryJPA extends JpaRepository<Game, Long>{
    
}

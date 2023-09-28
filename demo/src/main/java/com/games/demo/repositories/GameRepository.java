package com.games.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.games.demo.entities.Game;
import com.games.demo.entities.Player;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
    
}

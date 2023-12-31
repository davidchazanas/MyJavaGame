package com.games.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.games.demo.entities.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{
    
}

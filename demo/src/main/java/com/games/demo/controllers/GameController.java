package com.games.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.games.demo.entities.Game;
import com.games.demo.repositories.GameRepository;
import com.games.demo.services.GameService;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameRepository repository;

    @GetMapping
    public Game getGame() {
        GameService gameService = new GameService(repository);
        Game g = gameService.newGame();
        return g;
    }

/*
@GetMapping("/{id}")
public Game getGame(@PathVariable Long id) {
    GameService gameService = new GameService(repository);
    return gameService.findById(id).orElseThrow(RuntimeException::new);
}
*/
}

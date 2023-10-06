package com.games.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.games.demo.entities.Game;
import com.games.demo.repositories.GameRepository;
import com.games.demo.services.GameService;

@Controller
public class GameController {

    @Autowired
    private GameRepository repository;

    GameService gameService = new GameService(repository);

    @GetMapping("startgame")
    public String startGame(Model m) {
        Game g = gameService.newGame();
        m.addAttribute("gid", g.getId());
        return "game.html";
    }

    @GetMapping("index")
    public String index() {
        return "index.html";
    }

    public String result(Long gid) {
        // recebe o game
        if (gameService.testVictory(gid)) {
            return "victory.html";
        } else {
            return "defeat.html";
        }
    }

    @GetMapping("winthegame")
    public String winTheGame(@RequestParam Long gid) {
        // recebe o game
        gameService.winGame(gid);

        return result(gid);
    }

    @GetMapping("losethegame")
    public String loseTheGame(@RequestParam Long gid) {
        // recebe o game
        gameService.loseGame(gid);
        return result(gid);
    }

}

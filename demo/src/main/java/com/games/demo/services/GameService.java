package com.games.demo.services;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.games.demo.entities.Game;
import com.games.demo.repositories.IGameRepository;

@Service
public class GameService {

    private IGameRepository gameRepository;

    public GameService(IGameRepository iGameRepository){
        this.gameRepository = iGameRepository;
    }

    public Game findGameById(Long gid) {
        return gameRepository.findById(gid);
    }

    public void winGame(Long gid) {
        winGame(findGameById(gid));
    }

    public void winGame(Game game) {
        game.setVictory(true);
        gameRepository.save(game);
    }

    public Game getGameStatus(long id){
        Game g = findGameById(id);
        //recalculate things
        //long seconds = TimeUnit.MILLISECONDS.toSeconds(g.getLastUpdate().getTime() - new Date().getTime());
        long seconds = g.getLastUpdate().getTime() - new Date().getTime();
        
        g.setGold(g.getGold() + seconds*-1);
        saveGame(g);
        return g;
    }

    public Boolean testVictory(Long gid) {
        return testVictory(findGameById(gid));
    }

    public Boolean testVictory(Game game) {
        return game.getVictory();
    }

    public void loseGame(Long gid) {
        loseGame(findGameById(gid));
    }

    public void loseGame(Game game) {
        game.setVictory(false);
        gameRepository.save(game);
    }

    public Game newGame() {
        Game g = new Game();
        gameRepository.save(g);
        return g;
    }

    public void saveGame(Game g) {
        gameRepository.save(g);
    }

}

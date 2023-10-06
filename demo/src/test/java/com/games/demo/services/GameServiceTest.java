package com.games.demo.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.games.demo.entities.Game;
import com.games.demo.repositories.GameRepositoryTestImpl;

public class GameServiceTest {

    public GameService gameService = new GameService(new GameRepositoryTestImpl());
        
    @Test
    public void should_be_able_to_create_new_game(){
        Game newGame = gameService.newGame();   
        assertNotNull(newGame);
    }
   
    public void should_win_the_game(){
        Game newGame = gameService.newGame();
        gameService.winGame(newGame); 
    }
    
    public void should_lose_the_game(){
        Game newGame = gameService.newGame();
        gameService.winGame(newGame); 
    }

    
    //win game wins the game
    //lose game loses the game
    //restart the game starts a new game
    
    
}

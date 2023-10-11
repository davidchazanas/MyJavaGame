package com.games.demo.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

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
    
    @Test
    public void should_be_able_to_get_game_with_gold_bigger_than_original() throws InterruptedException{
        Game g = gameService.newGame();
        long id = g.getId();
        long gold = g.getGold();
        g = gameService.getGameStatus(id);
        assertTrue("Error. The server is not updating the gold properly", g.getGold() > gold);
        
    }

    //each user can win his and only his game
    //each user can lose his and only his game

    //restart the game starts a new  game




    //each user starts with some gold
    //user_should_be_able_to_invest_his_gold
    //invested_cash_should_grow
    //user_should_be_able_to_withdraw_his_cash
    //user_should_be_able_to_buy_stuff



    
    
}

package com.example.tennisscoreboard;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;

    @Before
    public void before(){
        player1 = new Player("Roger Federer", Nationality.SUI);
    }

    @Test
    public void playerHasName(){
        assertEquals("Roger Federer", player1.getName());
    }

    @Test
    public void playerHasNationality(){
        assertEquals(Nationality.SUI, player1.getNationality());
    }

    @Test
    public void canGetNationalityName(){
        assertEquals("Switzerland", player1.getNationalityName());
    }

    @Test
    public void pointsWonStartsAtZero(){
        assertEquals(0, player1.getPointsWon());
    }

    @Test
    public void gamesWonStartsAtZero(){
        assertEquals(0, player1.getGamesWon());
    }

    @Test
    public void setsWonStartsAtZero(){
        assertEquals(0, player1.getSetsWon());
    }

    @Test
    public void canWinAPoint(){
        player1.winPoint();
        assertEquals(1, player1.getPointsWon());
    }

    @Test
    public void canWinAGame(){
        player1.winGame();
        assertEquals(1, player1.getGamesWon());
    }

    @Test
    public void canWinASet(){
        player1.winSet();
        assertEquals(1, player1.getSetsWon());
    }

    @Test
    public void canResetPointsWon(){
        player1.winPoint();
        player1.winPoint();
        player1.winPoint();
        player1.resetPointsWon();
        assertEquals(0, player1.getPointsWon());
    }

    @Test
    public void canResetGamesWon(){
        player1.winGame();
        player1.winGame();
        player1.winGame();
        player1.resetGamesWon();
        assertEquals(0, player1.getGamesWon());
    }
}

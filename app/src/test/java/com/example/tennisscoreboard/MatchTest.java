package com.example.tennisscoreboard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatchTest {

    private Match match;
    private Player player1;
    private Player player2;

    @Before
    public void before() {
        player1 = new Player("Rafael Nadal", Nationality.ESP);
        player2 = new Player("Dominic Thiem", Nationality.AUT);
        match = new Match(player1, player2);
    }

    @Test
    public void player1CanWinPoint(){
        match.awardPointToPlayer1();
        assertEquals(1, player1.getPointsWon());
        assertEquals(0, player2.getPointsWon());
    }

    @Test
    public void player2CanWinPoint(){
        match.awardPointToPlayer2();
        assertEquals(1, player2.getPointsWon());
        assertEquals(0, player1.getPointsWon());
    }

    @Test
    public void player1WinsGameIfFourPointsWon(){
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        assertEquals(1, player1.getGamesWon());
        assertEquals(0, player1.getPointsWon());
    }

    @Test
    public void player1GoesToAdvantageIfPlayer2HasThree(){
        match.awardPointToPlayer2();
        match.awardPointToPlayer2();
        match.awardPointToPlayer2();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        assertEquals(0, player1.getGamesWon());
        assertEquals(4, player1.getPointsWon());
    }

    @Test
    public void player1WinsGameFromAdvantage(){
        match.awardPointToPlayer2();
        match.awardPointToPlayer2();
        match.awardPointToPlayer2();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        assertEquals(1, player1.getGamesWon());
        assertEquals(0, player1.getPointsWon());
    }

    @Test
    public void player1ReturnsToDeuceIfPlayer2Scores(){
        match.awardPointToPlayer2();
        match.awardPointToPlayer2();
        match.awardPointToPlayer2();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        match.awardPointToPlayer1();
        match.awardPointToPlayer2();
        assertEquals(3, player1.getPointsWon());
        assertEquals(3, player2.getPointsWon());
    }

}

package com.example.tennisscoreboard;

public class Match {

    private Player player1;
    private Player player2;
    private int setsNeededToWin;

    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.setsNeededToWin = 2;
    }

    public void awardPointToPlayer1() {
        if (player2.getPointsWon() == 4){
            player2.losePoint();
        } else if (player1.getPointsWon() == 3 && player2.getPointsWon() < 3){
            this.player1.winGame();
            this.player1.resetPointsWon();
        } else if (player1.getPointsWon() == 4 && player2.getPointsWon() == 3){
            this.player1.winGame();
            this.player1.resetPointsWon();
        } else {
            player1.winPoint();
        }

    }

    public void awardPointToPlayer2() {
        if (player1.getPointsWon() == 4){
            player1.losePoint();
        } else if (player2.getPointsWon() == 3 && player1.getPointsWon() < 3){
            this.player2.winGame();
            this.player2.resetPointsWon();
        } else if (player2.getPointsWon() == 4 && player1.getPointsWon() == 3){
            this.player2.winGame();
            this.player2.resetPointsWon();
        } else {
            player2.winPoint();
        }
    }
}

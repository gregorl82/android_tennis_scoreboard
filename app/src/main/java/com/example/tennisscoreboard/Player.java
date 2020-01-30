package com.example.tennisscoreboard;

public class Player {

    private String name;
    private Nationality nationality;
    private int pointsWon;
    private int gamesWon;
    private int setsWon;

    public Player(String name, Nationality nationality) {
        this.name = name;
        this.nationality = nationality;
        this.pointsWon = 0;
        this.gamesWon = 0;
        this.setsWon = 0;
    }

    public String getName() {
        return name;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public String getNationalityName() {
        return this.nationality.getName();
    }

    public int getPointsWon() {
        return pointsWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getSetsWon() {
        return setsWon;
    }

    public void winPoint() {
        this.pointsWon++;
    }

    public void losePoint(){
        this.pointsWon--;
    }

    public void winGame() {
        this.gamesWon++;
    }

    public void winSet() {
        this.setsWon++;
    }

    public void resetPointsWon() {
        this.pointsWon = 0;
    }

    public void resetGamesWon() {
        this.gamesWon = 0;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @authors Idel Pagan and gab James
 */
public class Player implements Serializable {

    // class instance variables
    private String name;
    private double highScore;
    public int playerCurrentScore;
    public char gameDidUserExplore;
    public int gameUserExploreCounter;
    public int playerLeashLenght;
    public int gameNumberOfTurns;
    public int gameFidoMood;
    public int gameIdealLeashLength;
    public int playerSatisfaction;
    public char playedMiniGame;
    public int winLose;

    public Player() {
    }

    public int getWinLose() {
        return winLose;
    }

    public void setWinLose(int winLose) {
        this.winLose = winLose;
    }

    public char getPlayedMiniGame() {
        return playedMiniGame;
    }

    public void setPlayedMiniGame(char playedMiniGame) {
        this.playedMiniGame = playedMiniGame;
    }

    public int getPlayerSatisfaction() {
        return playerSatisfaction;
    }

    public void setPlayerSatisfaction(int playerSatisfaction) {
        this.playerSatisfaction = playerSatisfaction;
    }

    public void setHighScore(double highScore) {
        this.highScore = highScore;
    }

    public void setPlayerCurrentScore(int playerCurrentScore) {
        this.playerCurrentScore = playerCurrentScore;
    }

    public void setGameDidUserExplore(char gameDidUserExplore) {
        this.gameDidUserExplore = gameDidUserExplore;
    }

    public void setGameUserExploreCounter(int gameUserExploreCounter) {
        this.gameUserExploreCounter = gameUserExploreCounter;
    }

    public void setPlayerLeashLenght(int playerLeashLenght) {
        this.playerLeashLenght = playerLeashLenght;
    }

    public void setGameNumberOfTurns(int gameNumberOfTurns) {
        this.gameNumberOfTurns = gameNumberOfTurns;
    }

    public void setGameFidoMood(int gameFidoMood) {
        this.gameFidoMood = gameFidoMood;
    }

    public void setGameIdealLeashLength(int gameIdealLeashLength) {
        this.gameIdealLeashLength = gameIdealLeashLength;
    }

    public double getHighScore() {
        return highScore;
    }

    public int getPlayerCurrentScore() {
        return playerCurrentScore;
    }

    public char getGameDidUserExplore() {
        return gameDidUserExplore;
    }

    public int getGameUserExploreCounter() {
        return gameUserExploreCounter;
    }

    public int getPlayerLeashLenght() {
        return playerLeashLenght;
    }

    public int getGameNumberOfTurns() {
        return gameNumberOfTurns;
    }

    public int getGameFidoMood() {
        return gameFidoMood;
    }

    public int getGameIdealLeashLength() {
        return gameIdealLeashLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public String toString() {
        return "Player{" + " name = " + name + ", High Score = " + highScore + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.highScore) ^ (Double.doubleToLongBits(this.highScore) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.highScore) != Double.doubleToLongBits(other.highScore)) {
            return false;
        }
        return true;
    }

}

package com.example.user.rockpaperscissorslabjava;

/**
 * Created by user on 19/09/2017.
 */

public class Game {

    String playerChoice;
    String computerChoice;

    public Game (String playerChoice, String computerChoice) {
        this.playerChoice = playerChoice;
        this.computerChoice = computerChoice;
    }

    public String playGame() {
        if (playerChoice.equals(computerChoice)) {
            return "Draw";
        }
        if (playerChoice.equals("Paper") && computerChoice.equals("Scissors")) {
            return "Computer Wins";
        }
        if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
            return "Player Wins";
        }
        if (playerChoice.equals("Rock") && computerChoice.equals("Paper")) {
            return "Computer Wins";
        }
        if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            return "Player Wins";
        }
        if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            return "Player Wins";
        }
        if (playerChoice.equals("Scissors") && computerChoice.equals("Rock")) {
            return "Computer Wins";
        }
        else return null;
    }
}

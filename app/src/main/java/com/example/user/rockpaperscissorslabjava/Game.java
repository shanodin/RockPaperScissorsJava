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
        if (playerChoice == computerChoice) {
            return "Draw";
        }
        if (playerChoice == "Paper" && computerChoice == "Scissors") {
            return "Computer Wins";
        }
        if (playerChoice == "Paper" && computerChoice == "Rock") {
            return "Player Wins";
        }
        if (playerChoice == "Rock" && computerChoice == "Paper") {
            return "Computer Wins";
        }
        if (playerChoice == "Rock" && computerChoice == "Scissors") {
            return "Player Wins";
        }
        if (playerChoice == "Scissors" && computerChoice == "Paper") {
            return "Player Wins";
        }
        if (playerChoice == "Scissors" && computerChoice == "Rock") {
            return "Computer Wins";
        }
        else return null;
    }
}

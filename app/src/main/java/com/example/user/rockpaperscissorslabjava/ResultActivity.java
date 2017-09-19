package com.example.user.rockpaperscissorslabjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView computerChoice;
    TextView playerChoice;
    TextView result;
    Button playAgainButton;
    NumberGenerator numberGenerator;
    RockPaperScissors elements;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        computerChoice = (TextView) findViewById(R.id.computer_choice);
        playerChoice = (TextView) findViewById(R.id.player_choice);
        result = (TextView) findViewById(R.id.winner_text_view);
        playAgainButton = (Button) findViewById(R.id.play_again_button);

        elements = new RockPaperScissors();

        numberGenerator = new NumberGenerator();

        String randomChoiceByComputer = elements.getRandomElement(numberGenerator);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String playerChoiceFromButton = extras.getString("player choice");

        game = new Game(playerChoiceFromButton, randomChoiceByComputer);

        String finalResult = game.playGame();

        computerChoice.setText("Computer chose " + randomChoiceByComputer);
        playerChoice.setText("Player chose " + playerChoiceFromButton);
        result.setText(finalResult);

    }

    public void onPlayAgainButtonClicked(View button) {
        Intent intent = new Intent(this, ChoiceActivity.class);
        startActivity(intent);
    }

}

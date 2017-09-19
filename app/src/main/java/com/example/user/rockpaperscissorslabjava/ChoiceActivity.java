package com.example.user.rockpaperscissorslabjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChoiceActivity extends AppCompatActivity {

    TextView motivationalPhrase;
    Button rockButton;
    Button scissorsButton;
    Button paperButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        motivationalPhrase = (TextView) findViewById(R.id.choice_activity_header);
        rockButton = (Button) findViewById(R.id.rock_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
        paperButton = (Button) findViewById(R.id.paper_button);
    }

    public void onRockButtonClicked(View button) {
        Intent intent = new Intent(this, ResultActivity.class);
        String rock = "Rock";
        intent.putExtra("player choice", rock);
        startActivity(intent);
    }

    public void onPaperButtonClicked(View button) {
        Intent intent = new Intent(this, ResultActivity.class);
        String paper = "Paper";
        intent.putExtra("player choice", paper);
        startActivity(intent);
    }

    public void onScissorsButtonClicked(View button) {
        Intent intent = new Intent(this, ResultActivity.class);
        String scissors = "Scissors";
        intent.putExtra("player choice", scissors);
        startActivity(intent);
    }
}

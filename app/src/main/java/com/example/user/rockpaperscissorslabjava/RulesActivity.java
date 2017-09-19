package com.example.user.rockpaperscissorslabjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RulesActivity extends AppCompatActivity {

    TextView rulesText;
    Button playGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        rulesText = (TextView) findViewById(R.id.rules_text);
        playGame = (Button) findViewById(R.id.play_button);
    }

    public void onPlayButtonClicked(View button){
        Intent intent = new Intent(this, ChoiceActivity.class);
        startActivity(intent);
    }
}

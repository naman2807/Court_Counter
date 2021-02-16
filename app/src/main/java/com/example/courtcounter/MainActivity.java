package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreOfA = 0;
    int scoreOfB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsOfA(View view){
        scoreOfA += 3;
        displayScoreForTeamA(scoreOfA);
    }

    public void twoPointsOfA(View view){
        scoreOfA += 2;
        displayScoreForTeamA(scoreOfA);
    }

    public void freeHitA(View view){
        scoreOfA += 1;
        displayScoreForTeamA(scoreOfA);
    }

    public void threePointsOfB(View view){
        scoreOfB += 3;
        displayScoreForTeamB(scoreOfB);
    }

    public void twoPointsOfB(View view){
        scoreOfB += 2;
        displayScoreForTeamB(scoreOfB);
    }

    public void freeHitB(View view){
        scoreOfB += 1;
        displayScoreForTeamB(scoreOfB);
    }

    public void displayScoreForTeamA(int score){
        TextView score1 = findViewById(R.id.team_a_score);
        score1.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score){
        TextView score1 = findViewById(R.id.team_b_score);
        score1.setText(String.valueOf(score));
    }

    public void reset(View view){
        TextView A = findViewById(R.id.team_a_score);
        TextView B = findViewById(R.id.team_b_score);
        scoreOfA = 0;
        scoreOfB = 0;
        displayScoreForTeamA(scoreOfA);
        displayScoreForTeamB(scoreOfB);
    }
}
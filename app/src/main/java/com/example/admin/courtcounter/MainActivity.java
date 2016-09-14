package com.example.admin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //buttons for team A
    public void add3teamA(View view){
        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA);

    }

    public void add2teamA(View view){
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);

    }
    public void add1teamA(View view){
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);

    }


    //buttons for team B
    public void add3teamB(View view){
        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB);

    }

    public void add2teamB(View view){
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);

    }
    public void add1teamB(View view){
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);

    }


    //reset button
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

//display for team A
    public  void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.textViewTeamA);
        scoreView.setText(String.valueOf(score));
    }
//display for team B
    public  void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.textViewTeamB);
        scoreView.setText(String.valueOf(score));
    }
}

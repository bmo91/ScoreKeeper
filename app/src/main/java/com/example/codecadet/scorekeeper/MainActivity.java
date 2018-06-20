package com.example.codecadet.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /***trial**/
    int scoreIvaMaria = 0;

    public void pointI(View view) {
        scoreIvaMaria = scoreIvaMaria + 1;
        displayForTeamA(scoreIvaMaria);

    }

    int scoreBarbara = 0;

    public void pointB(View view) {
        scoreBarbara = scoreBarbara + 1;
        displayForTeamB(scoreBarbara);

    }


    public void reset(View view) {
        scoreIvaMaria = 0;
        scoreBarbara = 0;
        displayForTeamA(scoreIvaMaria);
        displayForTeamB(scoreBarbara);
    }

    /**
     * Displays the given score for Iva Maria.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.iva_maria_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Barbara.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barbara_score);
        scoreView.setText(String.valueOf(score));
    }

}
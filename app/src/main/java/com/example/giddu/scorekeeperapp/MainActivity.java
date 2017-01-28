package com.example.giddu.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    int teamAFouls = 0;
    int teamBFouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Team A Updates

    public void incrementTeamAScore (View view){

        teamAScore++;
        displayTeamAScore();

    }

    public void displayTeamAScore  (){

        TextView v = (TextView) findViewById(R.id.teamAScoreView);
        v.setText(String.valueOf(teamAScore) + " Runs");
    }

    public void incrementTeamAFouls(View v) {

        teamAFouls++;
        displayTeamAFouls();

    }

    private void displayTeamAFouls() {

        TextView v =(TextView) findViewById(R.id.teamAFoulView);
        v.setText(String.valueOf(teamAFouls) + " Fouls");

    }

    //Team B Updates

    public void incrementTeamBScore (View view){

        teamBScore++;
        displayTeamBScore();

    }

    public void displayTeamBScore  (){

        TextView v = (TextView) findViewById(R.id.teamBScoreView);
        v.setText(String.valueOf(teamBScore) + " Runs");
    }

    public void incrementTeamBFouls(View v) {

        teamBFouls++;
        displayTeamBFouls();

    }

    private void displayTeamBFouls() {

        TextView v =(TextView) findViewById(R.id.teamBFoulView);
        v.setText(String.valueOf(teamBFouls)+ " Fouls");

    }

    //Resets


    public void resetGame(View v){
        teamAScore = 0;
        teamBScore = 0;
        teamAFouls = 0;
        teamBFouls = 0;

        displayTeamAFouls();
        displayTeamAScore();
        displayTeamBFouls();
        displayTeamBScore();

    }

    public void resetBatterA(View v){

        teamAFouls = 0;
        displayTeamAFouls();

    }

    public void resetBatterB(View v){

        teamBFouls = 0;
        displayTeamBFouls();

    }

}

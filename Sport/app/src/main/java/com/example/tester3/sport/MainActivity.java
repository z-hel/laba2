package com.example.tester3.sport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView scoreEdit1;
    private TextView scoreEdit2;
    private TextView foulEdit1;
    private TextView foulEdit2;
    int score1, score2, foul1, foul2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreEdit1 = findViewById(R.id.score_edit1);
        scoreEdit2 = findViewById(R.id.score_edit2);
        foulEdit1 = findViewById(R.id.foul_edit1);
        foulEdit2 = findViewById(R.id.foul_edit2);
        score1 = 0;
        score2 = 0;
        foul1 = 0;
        foul2 = 0;
    }


    public void addOne(View button) {
        score1 = Integer.parseInt(scoreEdit1.getText().toString());
        score2 = Integer.parseInt(scoreEdit2.getText().toString());
        foul1 = Integer.parseInt(foulEdit1.getText().toString());
        foul2 = Integer.parseInt(foulEdit2.getText().toString());
        switch (button.getId()) {
            case R.id.add_score1:
                scoreEdit1.setText(String.format(Locale.getDefault(), "%d", score1 + 1));
                break;
            case R.id.add_score2:
                scoreEdit2.setText(String.format(Locale.getDefault(), "%d", score2 + 1));
                break;
            case R.id.add_foul1:
                foulEdit1.setText(String.format(Locale.getDefault(), "%d", foul1 + 1));
                break;
            case R.id.add_foul2:
                foulEdit2.setText(String.format(Locale.getDefault(), "%d", foul2 + 1));
                break;
        }
    }

    public void clear(View button) {
        scoreEdit1.setText("0");
        scoreEdit2.setText("0");
        foulEdit1.setText("0");
        foulEdit2.setText("0");
    }
}

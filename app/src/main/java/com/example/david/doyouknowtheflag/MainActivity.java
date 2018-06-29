package com.example.david.doyouknowtheflag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayScore(int score){
        TextView scoree=(TextView) findViewById(R.id.score);
        scoree.setText("Score: "+score+"/7");
    }
    public void finish(View view){
        RadioButton question2=(RadioButton) findViewById(R.id.answer_sudan);
        RadioButton question1=(RadioButton) findViewById(R.id.answerNigeria);
        RadioButton question3=(RadioButton) findViewById(R.id.answerNorway);
        RadioButton question4=(RadioButton) findViewById(R.id.answerSweeden);
        RadioButton question5=(RadioButton) findViewById(R.id.answerSlovakia);
        RadioButton question6=(RadioButton) findViewById(R.id.answerSwaziland);
        RadioButton question7=(RadioButton) findViewById(R.id.answerTurkey);
        boolean questionA=question1.isChecked();
        boolean questionB=question2.isChecked();
        boolean questionC=question3.isChecked();
        boolean questionD=question4.isChecked();
        boolean questionE=question5.isChecked();
        boolean questionF=question6.isChecked();
        boolean questionG=question7.isChecked();
        if (questionA==true){
            score+=1;
        }
        if(questionB==true){
            score+=1;
        }
        if(questionC==true){
            score+=1;
        }
        if (questionD==true){
            score+=1;
        }
        if(questionE==true){
            score+=1;
        }
        if(questionF==true){
            score+=1;
        }
        if(questionG==true){
            score+=1;
        }
        displayScore(score);
    }
}

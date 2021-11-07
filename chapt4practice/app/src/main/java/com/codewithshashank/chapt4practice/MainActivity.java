package com.codewithshashank.chapt4practice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions= {"java is  a person?",
            "java was introduced in 1233?", "java was created usign python?",
            "java has abstract classes?", "Java supports interface?"};
    private boolean [] answers  = {false, false, false, true, true};
    private int score =0;
    private int index = 0;
    TextView Question;
    Button yes ;
    Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        Question = findViewById(R.id.Question);
        Question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1){
                    if(answers[index]==true){
                        //if you have given correct answer
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        Question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is:" +score +"/"+ questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart this app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if the array is not going out of bounds
                if(index<=questions.length-1){
                    if(answers[index] == false){
                        //if you have given correct answer
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        Question.setText(questions[index]);
                   }
                    else{
                    Toast.makeText(MainActivity.this, "Your score is:" +score +"/"+ questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart this app to play again", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}













































































































































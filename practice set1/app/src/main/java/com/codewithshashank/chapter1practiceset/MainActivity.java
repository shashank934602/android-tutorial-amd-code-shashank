package com.codewithshashank.chapter1practiceset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText editText;
    Button button;
    int ans = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        Toast.makeText(this, "Good morning", Toast.LENGTH_SHORT).show();
//        text = findViewById(R.id.text);
//        text.setText("Good Morning");
//        n1 = findViewById(R.id.n1);
//        n2 = findViewById(R.id.n2);
//        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                text.setText("the sum is " +sum);
            }
        });


    }
}
package com.codewithshashank.sharedprefsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = editText.getText().toString();
                SharedPreferences sP = getSharedPreferences("mypref",MODE_PRIVATE);
                SharedPreferences.Editor ed = sP.edit();
                ed.putString("name", "harry");
                ed.apply();
                textView.setText(val);

            }
        });
        SharedPreferences sP = getSharedPreferences("mypref",MODE_PRIVATE);
        String editval = sP.getString("name", "No value As if now");

        textView.setText(editval);

    }
}
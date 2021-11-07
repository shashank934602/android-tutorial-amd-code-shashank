package com.codewithshashank.horizontalscrolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        Log.d("General","this app is working properly" );
        Log.e("Harry","this app is error properly" );

        button.setOnClickListener(new View.OnClickListener()
               {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "there is a on this button", Toast.LENGTH_SHORT).show();
                Log.d("Harry","this button is working properly" );

            }
        });
    }
}
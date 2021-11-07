package com.codewithshashank.firstmultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String Extra_name = "com.codewithshashank.firstmultiscreen.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void openActivity(View v){
        Toast.makeText(this, "Opening Second Activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        name = findViewById(R.id.name);

        String nametext = name.getText().toString();
        intent.putExtra(Extra_name, nametext );
        startActivity(intent);
    }
}
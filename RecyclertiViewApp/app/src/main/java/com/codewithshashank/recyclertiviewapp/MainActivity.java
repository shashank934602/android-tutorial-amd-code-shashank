package com.codewithshashank.recyclertiviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] arr = {"item 1", "item2","item3","item4", "item5","item6","item7","item8","item9","item11","item12", };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclervView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(arr);
        recyclerView.setAdapter(c);

    }

}
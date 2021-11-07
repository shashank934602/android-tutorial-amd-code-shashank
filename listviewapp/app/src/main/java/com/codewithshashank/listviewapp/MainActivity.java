package com.codewithshashank.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String arr[] = {"this is","item","four","Another Item","another","nau", "mail3", "mail4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        //using built in array adapter
       // ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//        listView.setAdapter(ad);
//
        //using our custom  adapter
        ShashankAdapter ad = new ShashankAdapter(this,R.layout.my_shashank_layout, arr);
        // listener onArrayAdapter's Listview
        listView.setAdapter(ad);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "You clicked me" + i, Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}
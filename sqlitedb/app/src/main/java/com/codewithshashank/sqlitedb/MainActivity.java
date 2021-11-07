package com.codewithshashank.sqlitedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DbHandler handler = new DbHandler(this, "empd", "null", 1);
        handler.addEmployee(new Employee(10, "Harry", 33.3));
        handler.getEmployee(1);
        handler.close();
    }


}
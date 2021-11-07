package com.codewithshashank.sqlitedb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DbHandler extends SQLiteOpenHelper {
    public DbHandler(@Nullable Context context, @Nullable String name, @Nullable String factory , int version) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE Myemployee(sno Integer PRIMARY KEY, name TEXT, increment Text)";
//        SQLiteDatabase db = this.getReadableDatabase();

//        Object db = null;
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String upgrade = "create table My employee(sno Integer PRIMARY KEY, name TEXT, increment Text)";
        String drop =String.valueOf ("DROP TABLE IF EXISTS");
        db.execSQL(drop, new String[]{"myemployee"});
        onCreate(db);

    }
    public void addEmployee(Employee emp){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", emp.getName());
        values.put("incremenent", emp.getIncrement());
        long k = db.insert("employee", null, values);
        Log.d("mytag",Long.toString(k));
        db.close();
    }
    public void getEmployee(int sno){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query("my emoloyee", new String[]{"sno","name", "increment"}, "sno-?",new String[]{String.valueOf(sno)},null, null, null);
        if(cursor != null && cursor.moveToFirst()){
            Log.d("mytag name", cursor.getString(1));
            Log.d("mytag incremenent", cursor.getString(2));
        }else {
            Log.d("mytag", "some error occurred");

        }

    }
}

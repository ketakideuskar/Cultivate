package com.example.cultivate;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Cultivate.db";
    public static final String TABLE_NAME = "user_table";
    public static final String Col_1 = "USERNAME";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "SURNAME";
    public static final String COL_4 = "METRO";
    public static final String COL_5 = "CITY";
    public static final String COL_6 = "LANGUAGE";
    public static final String COL_7 = "STUDENT";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(USERNAME TEXT, NAME TEXT, SURNAME TEXT, METRO TEXT, CITY TEXT, LANGUAGE TEXT, STUDENT BOOLEAN)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String username, String name, String surname, String metro, String city, String language, boolean student) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Col_1, username);
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, surname);
        contentValues.put(COL_4, metro);
        contentValues.put(COL_5, city);
        contentValues.put(COL_6, language);
        contentValues.put(COL_7, student);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
}

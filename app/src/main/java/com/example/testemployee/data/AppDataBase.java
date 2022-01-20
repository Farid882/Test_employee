package com.example.testemployee.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.testemployee.pojo.Employee;

@Database(entities = {Employee.class},version = 1,exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {
    private static final String DB_NAME="employees.db";
    private static AppDataBase database;
    private static  final Object LOCK = new Object();

    public static AppDataBase getInstance(Context context){
        synchronized (LOCK) {
            if (database == null) {
                database = Room.databaseBuilder(context, AppDataBase.class, DB_NAME).build();
            }
            return database;
        }
    }
}

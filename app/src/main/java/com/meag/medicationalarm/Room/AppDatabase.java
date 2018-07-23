package com.meag.medicationalarm.Room;


import android.content.Context;


import android.arch.persistence.room.Database;

import android.arch.persistence.room.Room;

import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Reminder.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {


    private static AppDatabase INSTANCE;


    public abstract RemindersDao remindersDao();


    public static AppDatabase getInMemoryDatabase(Context context) {

        if (INSTANCE == null) {
            INSTANCE = Room.inMemoryDatabaseBuilder(context.getApplicationContext(), AppDatabase.class).build();
        }
        return INSTANCE;

    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

}


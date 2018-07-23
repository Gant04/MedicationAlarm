package com.meag.medicationalarm.Room;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface RemindersDao {
    @Insert(onConflict = REPLACE)
    void insert(Reminder Reminder);

    @Query("DELETE FROM reminder")
    void deleteAll();

    @Query("DELETE FROM reminder WHERE id_reminder=:id")
    void deleteById(int id);

    @Query("SELECT * FROM reminder ORDER BY id_reminder ASC")
    LiveData<List<Reminder>> getAllReminder();

    @Query("SELECT * FROM reminder WHERE id_reminder=:id")
    Reminder getReminderById(int id);

}

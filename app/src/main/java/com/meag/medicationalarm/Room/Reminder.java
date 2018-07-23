package com.meag.medicationalarm.Room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;


import com.meag.medicationalarm.Room.DateConverter;

import java.util.Date;


@Entity(tableName = "reminder")

public class Reminder {

    @PrimaryKey(autoGenerate = true)
    private int id_reminder;
    @TypeConverters(DateConverter.class)
    private Date dateStart;
    @TypeConverters(DateConverter.class)
    private Date dateEnd;
    private String type_of;
    private boolean on_of;


    public int getId_reminder() {
        return id_reminder;
    }

    public void setId_reminder(int id_reminder) {
        this.id_reminder = id_reminder;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getType_of() {
        return type_of;
    }

    public void setType_of(String type_of) {
        this.type_of = type_of;
    }

    public boolean isOn_of() {
        return on_of;
    }

    public void setOn_of(boolean on_of) {
        this.on_of = on_of;
    }
}

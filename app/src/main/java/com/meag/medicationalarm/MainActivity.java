package com.meag.medicationalarm;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.meag.medicationalarm.Room.Reminder;
import com.meag.medicationalarm.Room.ViewModelsApp;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewModelsApp viewModelsApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModelsApp = ViewModelProviders.of(this).get(ViewModelsApp.class);

        LiveData<List<Reminder>> remindersList = viewModelsApp.getRemindersList();
        remindersList.observe(this, new Observer<List<Reminder>>() {
            @Override
            public void onChanged(@Nullable List<Reminder> reminderList) {
//                adapter.setList(doseList);
//                adapter.notifyDataSetChanged();
            }
        });
    }
}

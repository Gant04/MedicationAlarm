package com.meag.medicationalarm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    //    ViewModelsApp viewModelsApp;
    private ImageView add_alarm;
    private RecyclerView alarm_container;
    private LinearLayout add_container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add_alarm = findViewById(R.id.add);
        add_container = findViewById(R.id.add_button_container);
        alarm_container = findViewById(R.id.recycler_view);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.transition);

        add_alarm.startAnimation(anim);
        add_container.startAnimation(anim);
        alarm_container.startAnimation(anim);


//        viewModelsApp = ViewModelProviders.of(this).get(ViewModelsApp.class);
//
//        LiveData<List<Reminder>> remindersList = viewModelsApp.getRemindersList();
//        remindersList.observe(this, new Observer<List<Reminder>>() {
//            @Override
//            public void onChanged(@Nullable List<Reminder> reminderList) {
//                adapter.setList(doseList);
//                adapter.notifyDataSetChanged();
//            }
//        });
    }
}

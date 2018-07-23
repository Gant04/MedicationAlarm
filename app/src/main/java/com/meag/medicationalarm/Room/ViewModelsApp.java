package com.meag.medicationalarm.Room;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import java.util.List;

public class ViewModelsApp extends AndroidViewModel{
    private Repository mRepository;

    private LiveData<List<Reminder>> mRemindersList;

    public ViewModelsApp(@NonNull Application application) {
        super(application);
        mRepository = new Repository(application);
        mRemindersList=mRepository.getAllReminders();
    }


    public LiveData<List<Reminder>> getRemindersList() {
        return mRepository.getAllReminders();
    }
    public void insertAlarm(Reminder reminder) {
        mRepository.insert(reminder);
    }
}

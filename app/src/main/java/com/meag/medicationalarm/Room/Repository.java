package com.meag.medicationalarm.Room;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Database;
import android.os.AsyncTask;

import java.util.List;

public class Repository {
    private RemindersDao remindersDao;

    public Repository(Application application) {
        AppDatabase db=AppDatabase.getInMemoryDatabase(application);
        remindersDao = remindersDao;
    }


    public void insert(Reminder reminder) {
        new insertAsyncTask(remindersDao).execute();
    }

    private static class insertAsyncTask extends AsyncTask<Reminder, Void, Void> {

        private RemindersDao mAsyncTaskDao;

        insertAsyncTask(RemindersDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Reminder... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }

    public LiveData<List<Reminder>> getAllReminders() {
        return remindersDao.getAllReminder();
    }
}

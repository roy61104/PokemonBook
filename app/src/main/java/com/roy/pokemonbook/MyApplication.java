package com.roy.pokemonbook;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.roy.pokemonbook.db.Pokemon;

import org.jetbrains.annotations.NotNull;

import java.lang.ref.WeakReference;

import dagger.hilt.android.HiltAndroidApp;


@HiltAndroidApp
public class MyApplication extends Application {

    private static final Object object = new Object();

    private static WeakReference<Context> context;

    private static final String TAG = "MyApplication";

    private static AppDataBase dataBase;

    public static Context getContext() {
        return context.get();
    }

    public static AppDataBase getDataBaseInstance() {
        synchronized (object) {
            if (dataBase == null) {
                // 创建数据库
                dataBase = Room.databaseBuilder(getContext(), AppDataBase.class, "database-pokemon").build();
            }
            return dataBase;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = new WeakReference<Context>(this);
    }
}

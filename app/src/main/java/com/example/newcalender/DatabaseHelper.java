package com.example.newcalender;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "scheduler.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_TASKS = "tasks";
    private static final String TABLE_REMINDERS = "reminders";
    private static final String TABLE_SLEEP_RECORDS = "sleep_records";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create tables
        String createTasksTable = "CREATE TABLE " + TABLE_TASKS + " ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "title TEXT,"
                + "start_time INTEGER,"
                + "end_time INTEGER,"
                + "repeat INTEGER"
                + ")";
        db.execSQL(createTasksTable);

        String createRemindersTable = "CREATE TABLE " + TABLE_REMINDERS + " ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "title TEXT,"
                + "datetime INTEGER,"
                + "repeat INTEGER"
                + ")";
        db.execSQL(createRemindersTable);

        String createSleepRecordsTable = "CREATE TABLE " + TABLE_SLEEP_RECORDS + " ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "date INTEGER,"
                + "hours INTEGER,"
                + "minutes INTEGER"
                + ")";
        db.execSQL(createSleepRecordsTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Upgrade database schema
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TASKS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_REMINDERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SLEEP_RECORDS);
        onCreate(db);
    }

    // CRUD operations for tasks, reminders, and sleep records...
}

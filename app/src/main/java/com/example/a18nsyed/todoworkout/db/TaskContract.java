package com.example.a18nsyed.todoworkout.db;

/**
 * Created by 18NSyed on 12/8/2017.
 */
import android.provider.BaseColumns;

//SQL Database where data is stored
public class TaskContract {
    public static final String DB_NAME = "com.example.a18nsyed.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}


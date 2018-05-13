package com.brett.beam.database;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Rony BIEN-AIME
 * on 5/13/2018.
 */

@Database(name = MyDatabase.NAME, version = MyDatabase.VERSION)
public class MyDatabase {
    public static final String NAME = "MyDataBase";

    public static final int VERSION = 1;
}
package com.laugracianool.peluchitosv2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PeluchitosSQLiteHelper extends SQLiteOpenHelper {

    String sqlCreate = "CREATE TABLE peluches (" +
            "codigo     INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "nombre     TEXT, " +
            "cantidad   INTEGER, " +
            "precio     INTEGER)";

    public PeluchitosSQLiteHelper(Context context,
                                  String name,
                                  SQLiteDatabase.CursorFactory factory,
                                int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){ db.execSQL(sqlCreate); }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS peluchitos");
        db.execSQL(sqlCreate);

    }
}


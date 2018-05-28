package org.hanana.hananaapp.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.hanana.hananaapp.SignIn1;

import sun.awt.SunHints;


public class HananaDatabaseSQlite extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "HananaDB";
    private static final String TABLE_NAME = "SignIn_Table";
    private static final String COLOUMN_ID = "SignIn_ID";
    private static final String COLOUMN_USERNAME = "SignIn_Username";
    private static final String COLOUMN_PASSWORD = "SignIn_Password";
    SQLiteDatabase sqLiteDatabase;

    private static final String TABLE_CREATE = "create table SignIn_Table (SignIn_ID integer primary key not null  auto_increment  ," +
            "SignIn_Username text not null , SignIn_Password text not null);";

    public HananaDatabaseSQlite(Context context){
        super(context, DATABASE_NAME , null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLE_CREATE);
        this.sqLiteDatabase = sqLiteDatabase;
    }


  /*  public String searchpassSignIn1 (String SignIn_Username){
        sqLiteDatabase = this.getReadableDatabase();
        String query = "select SignIn_Username, SignIn_Password from"+TABLE_NAME;
        Cursor cursor = sqLiteDatabase.rawQuery(query , null);
        String a,b;
        b = "not found";
        if(cursor.moveToFirst()){
            do {
                a = cursor.getString(0);
                if (a.equals(SignIn_Username)){
                    b = cursor.getString(1);
                    break;
                }
            }
            while (cursor.moveToNext());
        }
        return b;
    } */



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query = "DROP TABLE IF EXISTS "+ TABLE_NAME;
        sqLiteDatabase.execSQL(query);
        this.onCreate(sqLiteDatabase);
    }
}

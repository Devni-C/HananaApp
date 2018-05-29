package org.hanana.hananaapp.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.hanana.hananaapp.User;

import java.awt.Cursor;


public class HananaDatabaseSQlite extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "HananaDB";
    private static final String USER = "user";
    private static final String ID = "id";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String EMAIL = "email";
    private static final String PHONENUMBER= "phonenumber";
    SQLiteDatabase sqLiteDatabase;

    private static final String USER_TABLE = "create table "
            + USER + " (" + ID  + " integer primary key autoincrement not null,"
             + USERNAME +" text not null ," + PASSWORD + " text not null ," + EMAIL + " text not null ," + PHONENUMBER + " text not null);";

    public HananaDatabaseSQlite(Context context){
        super(context, DATABASE_NAME , null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(USER_TABLE);
        this.sqLiteDatabase = sqLiteDatabase;
    }

    public void insertUser(User u){
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        /* String query = "select * from user";
        Cursor cursor = (Cursor) sqLiteDatabase.rawQuery(query,null);
        int count = cursor.getCount();


        values.put(ID,count);*/
        values.put(USERNAME,u.getUsername());
        values.put(EMAIL,u.getEmail());
        values.put(PHONENUMBER,u.getPhonenumber());
        values.put(PASSWORD,u.getPhonenumber());

        sqLiteDatabase.insert(USER,null,values);
        sqLiteDatabase.close();

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
        String query = "DROP TABLE IF EXISTS "+ USER;
        sqLiteDatabase.execSQL(query);
        this.onCreate(sqLiteDatabase);
    }
}

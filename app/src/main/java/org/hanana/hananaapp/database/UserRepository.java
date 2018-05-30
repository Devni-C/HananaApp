package org.hanana.hananaapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import org.hanana.hananaapp.models.User;

public class UserRepository extends HananaDB {


    public UserRepository(Context context) {
        super(context);
    }

    // TODO: method to insert a user
    public void insertUser(User user){
        SQLiteDatabase database = getWritableDatabase();
        String insertQuery = "insert into " + TABLE_USER;
        insertQuery += " values( null, '" + user.getUsername();
        insertQuery += "', '" + user.getPassword();
        insertQuery += "', '" + user.getName();
        insertQuery += "', '" + user.getEmail();
        insertQuery += "', '" + user.getMobileNumber();
        insertQuery += "' )";

        database.execSQL(insertQuery);
        database.close();
        Log.i("HANANA", user.getName() + " is added!");
    }
}

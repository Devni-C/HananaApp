package org.hanana.hananaapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

// this class manages the basic database functions including inserting, updating, deleting and selecting an user.
public class UserDbManager {



    public static void testDb (){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");

    }

    public static void addUser (){

    }

    public static void updateUser (String userId) {


    }

    public static void deleteUser () {

    }

    public static void selectUserByPhoneNumber (int phoneNumber){

    }
}
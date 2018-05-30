package org.hanana.hananaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
    }

    public void AccSettingsOnClick(View view){

        AccountSettings();
    }

    public void MyEventsOnClick(View view){

        MyEvents();
    }

    public void MyFavouritesOnClick(View view){

        MyFavourites();
    }


    public void LogoutOnClick(View view){

        Logout();
    }







    private void AccountSettings(){
        AccountSettingsActivity accountsettingsactivity = new AccountSettingsActivity();
        accountsettingsactivity.setVisible(true);
    }


    private void MyEvents(){
        MyEventsActivity myeventsactivity = new MyEventsActivity();
        myeventsactivity.setVisible(true);
    }


    private void MyFavourites(){
        MyFavouritesActivity myfavouritesactivity = new MyFavouritesActivity();
        myfavouritesactivity.setVisible(true);
    }

    private void Logout(){
        SignInActivity signinactivity = new SignInActivity();
        signinactivity.setVisible(true);
    }
}

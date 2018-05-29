package org.hanana.hananaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.hanana.hananaapp.database.HananaDB;

public class MainActivity extends AppCompatActivity {

    HananaDB helper = new HananaDB(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setFinishOnTouchOutside(boolean finish) {

    }




}

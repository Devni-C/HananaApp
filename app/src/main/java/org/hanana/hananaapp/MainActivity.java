package org.hanana.hananaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.hanana.hananaapp.Database.HananaDatabaseSQlite;

public class MainActivity extends AppCompatActivity {

    HananaDatabaseSQlite helper = new HananaDatabaseSQlite(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setFinishOnTouchOutside(boolean finish) {

    }




}

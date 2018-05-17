package org.hanana.hananaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setFinishOnTouchOutside(boolean finish) {

    }

    public void onButtonClick(View v)
    {
        if(v.getId()==R.id.bsignIn)

            EditText a = (EditText)findViewById(R.id.Lusername);

            Intent i = new Intent(MainActivity.this, EventsActivity.class);
            i.putExtra(i)
            startActivity(i);

    }
}

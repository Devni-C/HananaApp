package org.hanana.hananaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.hanana.hananaapp.Database.HananaDatabaseSQlite;
import org.hanana.hananaapp.exceptions.HananaException;

public class SignIn1 extends AppCompatActivity {

    HananaDatabaseSQlite HananaHelper = new HananaDatabaseSQlite(this);

    private String mName;
    private String mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in1);
    }

    public void setmName(){
        mName = findViewById(R.id.signInUNameEditText).toString();
    }

    public void setmPassword(){
        mPassword = findViewById(R.id.signInPasswordEditText).toString();
    }

    private void onButtonClick(View view) throws HananaException {

           setmName();
           setmPassword();
           signInCheckDB();

           }


    private void signInCheckDB() throws HananaException
    {
        String s1="SELECT pwd,username FROM signInDBTable where  username='"+mName+"'" ;

        if(s1!=null)
        {
            EventsActivity eventsAct = new EventsActivity();
            eventsAct.setVisible(true);

        }
        else
        {
            SignIn1 signinobj = new SignIn1();
            signinobj.setVisible(true);

        }
    }

}




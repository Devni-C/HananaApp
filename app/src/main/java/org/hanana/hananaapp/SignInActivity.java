package org.hanana.hananaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.hanana.hananaapp.Database.HananaDatabaseSQlite;
import org.hanana.hananaapp.exceptions.HananaException;

public class SignInActivity extends AppCompatActivity {

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

    public void onButtonClick(View view) throws HananaException {

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
            SignInActivity signinobj = new SignInActivity();
            signinobj.setVisible(true);

        }
    }

    public void onButtonClick1(View view) {
        SignUp1Activity signUpAct = new SignUp1Activity();
        signUpAct.setVisible(true);
    }
}




package org.hanana.hananaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    private String uName;
    private String uPassword;
    private String uConfirmPassword;
    private String uEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void setuName(){
        uName = findViewById(R.id.signUpUNameEditText).toString();
    }

    public void setuPassword(){
        uPassword = findViewById(R.id.signUpPasswordEditText).toString();
    }


    public void uConfirmPassword(){ uConfirmPassword = findViewById(R.id.signUpConfirmPasswordEditText).toString();}


    public void setuEmail(){
        uEmail = findViewById(R.id.emailEditText).toString();
    }




    public void onButtonClick(View v)
    {
        if(v.getId()==R.id.bsignIn)
        {

            EditText a = (EditText) findViewById(R.id.Lusername);
            String st = a.getText().toString();

            Intent i = new Intent(this, EventsActivity.class);
            i.putExtra("username",st);
            startActivity(i);
        }
    }
}

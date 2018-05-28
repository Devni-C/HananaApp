package org.hanana.hananaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import org.hanana.hananaapp.Database.HananaDatabaseSQlite;

import javax.swing.text.View;

public class SignUp1Activity extends AppCompatActivity {

    HananaDatabaseSQlite helper = new HananaDatabaseSQlite(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up1);
    }

    public void onSignUpClick(View v){

        //User us = new User();
        //us.getId();

        if (v.getId == R.id.BsignUpButton)
        {
            EditText username = (EditText)findViewById(R.id.username);
            EditText email = (EditText)findViewById(R.id.email);
            EditText phonenumber = (EditText)findViewById(R.id.phonenumber);
            EditText password = (EditText)findViewById(R.id.password);
            EditText ConfirmPassword = (EditText)findViewById(R.id.ConfirmPassword);

            String usernamestr = username.getText().toString();
            String emailstr = email.getText().toString();
            String phonenumberstr = phonenumber.getText().toString();
            String passwordstr = password.getText().toString();
            String ConfirmPasswordstr = ConfirmPassword.getText().toString();

            if (!passwordstr.equals(ConfirmPasswordstr)){
                //pop msg
                Toast pass = Toast.makeText(SignUp1Activity.this, "Password don't match" , Toast.LENGTH_SHORT);
                pass.show();
            }
            else {
               //insert the details in database
               User u = new User();
               u.setUsername(usernamestr);
               u.setEmail(emailstr);
               u.setPhonenumber(phonenumberstr);
               u.setPassword(passwordstr);


               helper.insertUser(u);

            }

        }
    }

}

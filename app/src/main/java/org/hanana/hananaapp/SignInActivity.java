package org.hanana.hananaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.hanana.hananaapp.database.UserRepository;
import org.hanana.hananaapp.events.EventsActivity;
import org.hanana.hananaapp.exceptions.HananaException;
import org.hanana.hananaapp.models.User;

public class SignInActivity extends AppCompatActivity {
    // widget references
    private EditText mUsernameEditTExt;
    private EditText mPasswordEditText;
    private Button mSignInButton;
    private Button mSignUpButton;

    // User repository instance to sign in the user
    private UserRepository mUserRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // instantiating the user repository
        mUserRepository = new UserRepository(getApplicationContext());

        // setup widgets
        setupWidgets();

        //setup listeners
        setupListeners();

    }

    // helper to sign in the user
    private void signInUser() {
        // get user name and password from edit texts
        String username = mUsernameEditTExt.getText().toString();
        String password = mPasswordEditText.getText().toString();

        try {
            User user = mUserRepository.getUserByUsernameAndPassword(username, password);

            // user found, go to the events page
            Intent intent = new Intent(getApplicationContext(), EventsActivity.class);
            startActivity(intent);

        } catch (HananaException e) {
            Log.i("HANANA", e.getErrorMessage());
            Toast.makeText(getApplicationContext(),e.getErrorMessage(), Toast.LENGTH_LONG);
        }

    }

    // helper to setup listeners
    private void setupListeners() {
        // listener on sign in button
        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signInUser();
            }
        });

        // listener on sign up
        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUpUser();

            }
        });
    }

    // helper to send user to the sign up page
    private void signUpUser() {
        // go to the sign up page
        Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
        startActivity(intent);
    }


    // helper to setup widget references
    private void setupWidgets() {
        mUsernameEditTExt = setupEditText(R.id.sign_in_username_edit_text);
        mPasswordEditText = setupEditText(R.id.sign_in_password_edit_text);
        mSignInButton = setupButton(R.id.sign_in_btn);
        mSignUpButton = setupButton(R.id.hanana_sign_up_btn);
    }

    // helper to setup an EditText
    private Button setupButton(int id) {
        return (Button) findViewById(id);
    }

    // helper to setup an EditText
    private EditText setupEditText(int id) {
        return (EditText) findViewById(id);
    }


}

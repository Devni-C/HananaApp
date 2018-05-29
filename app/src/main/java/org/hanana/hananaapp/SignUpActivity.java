package org.hanana.hananaapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.hanana.hananaapp.database.UserRepository;
import org.hanana.hananaapp.exceptions.HananaException;
import org.hanana.hananaapp.models.User;

public class SignUpActivity extends Activity {
    // widget references
    private EditText mUsernameEditText;
    private EditText mNameEditText;
    private EditText mEmailEditText;
    private EditText mPhoneNumberEditText;
    private EditText mPasswordEditText;
    private EditText mConfirmPasswordEditText;
    private Button mSignUpButton;

    // User repository instance to add the user
    private UserRepository mUserRepository;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        // instantiate the User Repository
        mUserRepository = new UserRepository(getApplicationContext());
        // set up widget references
        setupWidgets();
        // set up listeners
        setupListeners();
    }

    // helper to setup listeners
    private void setupListeners() {
        // listener on sign up button
        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUpUser();
            }
        });
    }

    // Helper to sign up the user
    private void signUpUser() {
        String username = getText(mUsernameEditText);
        String name = getText(mNameEditText);
        String email = getText(mEmailEditText);
        String phoneNumber = getText(mPhoneNumberEditText);
        String password = getText(mPasswordEditText);
        String confirmPassword = getText(mConfirmPasswordEditText);

        try{
            // check if password and confirmation matches
            if(isPasswordConfirmed(password, confirmPassword)){
                // create user
                User user = new User(0, username,password);
                // set other attributes
                user.setName(name);
                user.setEmail(email);
                user.setMobileNumber(phoneNumber);

                // add the user to the database
                mUserRepository.insertUser(user);


            }else{
                throw new HananaException("Password is not confirmed.");
            }
        }catch (HananaException ex){
            Log.i("HANANA", ex.getErrorMessage());

        }
    }

    // Helper to check if password is confirmed
    private boolean isPasswordConfirmed(String password, String confirmPassowrd) {
        if(password != null && confirmPassowrd != null){
            if(password.equals(confirmPassowrd)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    // helper to get EditText text
    private String getText(EditText editText) {
        return editText.getText().toString();
    }

    // helper to setup widgets
    private void setupWidgets() {
        mUsernameEditText = setUpEditText(R.id.sign_up_username_edit_text);
        mNameEditText = setUpEditText(R.id.sign_up_name_edit_text);
        mEmailEditText = setUpEditText(R.id.sign_up_email_edit_text);
        mPhoneNumberEditText = setUpEditText(R.id.sign_up_phone_edit_text);
        mPasswordEditText = setUpEditText(R.id.sign_up_password_edit_text);
        mConfirmPasswordEditText = setUpEditText(R.id.sign_up_confirm_password_edit_text);
        mSignUpButton = (Button) findViewById(R.id.sign_up_button);
    }

    // helper to setup an edit text
    private EditText setUpEditText(int id) {
        return (EditText) findViewById(id);
    }


}

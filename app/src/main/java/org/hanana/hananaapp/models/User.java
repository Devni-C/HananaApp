package org.hanana.hananaapp.models;

public class User {
    // isntance variables
    private long mId;
    private String mUsername;
    private String mPassword;
    private String mName;
    private String mEmail;
    private String mMobileNumber;

    // constructor
    public User(long id) {
        mId = id;
    }

    public long getId() {
        return mId;
    }

    public String getUsername() {
        return mUsername;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getMobileNumber() {
        return mMobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        mMobileNumber = mobileNumber;
    }
}

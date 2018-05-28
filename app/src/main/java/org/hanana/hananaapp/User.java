package org.hanana.hananaapp;

public class User {

    int id;
    String password , email , username , phonenumber;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }

    public void setPhonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }
    public String getPhonenumber(){
        return this.phonenumber;
    }

}

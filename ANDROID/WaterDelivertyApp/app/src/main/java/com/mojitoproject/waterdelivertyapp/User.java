package com.mojitoproject.waterdelivertyapp;

public class User {

    public String userNamePassword, userPassword, phoneNo, email;

    public User(){

    }

    public User(String userNamePassword, String userPassword, String phoneNo, String email) {
        this.userNamePassword = userNamePassword;
        this.userPassword = userPassword;
        this.phoneNo = phoneNo;
        this.email = email;
    }
}

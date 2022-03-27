package com.example.nutriorder.Models;

public class user {
    String fullname,email,password,phoneno;

    public user(String fullname, String email, String password, String phoneno) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.phoneno = phoneno;
    }






    public String user(String fullname, String email, String password) {

        this.email = email;
        this.password = password;

        return fullname ;
    }





    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}

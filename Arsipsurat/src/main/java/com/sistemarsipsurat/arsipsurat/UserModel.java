package com.sistemarsipsurat.arsipsurat;

public class UserModel {
    protected String username;
    protected String password;

    public UserModel(String username,String password){
        this.username = username;
        this.password = password;
    }
    public UserModel(){

    }
    public String getUsername(){
        return username;
    }
    public void setUsername(){
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.pd.pd.model;


public class User {

    private int id;
    private String username;
    private String password;
    private String name;
    private int connected;
    private String token;

    public User(int id, String username){
        this.id = id;
        this.username = username;

    }

    public User(String username,String password){
        this.username= username;
        this.password = password;
    }

    // Getters


    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getConnected() {
        return connected;
    }

    public String getToken() {
        return token;
    }

    // Setters


    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConnected(int connected) {
        this.connected = connected;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

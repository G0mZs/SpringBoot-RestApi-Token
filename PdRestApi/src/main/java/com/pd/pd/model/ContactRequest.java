package com.pd.pd.model;

import javax.persistence.*;

public class ContactRequest {

    private int user1Id;
    private int user2Id;
    private int aceite;


    //Getters

    public int getUser1Id() {
        return user1Id;
    }

    public int getUser2Id() {
        return user2Id;
    }

    public int getAceite() {
        return aceite;
    }

    // Setters

    public void setUser1Id(int user1Id) {
        this.user1Id = user1Id;
    }

    public void setUser2Id(int user2Id) {
        this.user2Id = user2Id;
    }

    public void setAceite(int aceite) {
        this.aceite = aceite;
    }
}

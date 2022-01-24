package com.pd.pd.model;

import javax.persistence.*;

public class GroupRequest {

    private int GroupId;
    private int UserId;
    private int aceite;


    // Getters

    public int getGroupId() {
        return GroupId;
    }

    public int getUserId() {
        return UserId;
    }

    public int getAceite() {
        return aceite;
    }


    //Setters


    public void setGroupId(int groupId) {
        GroupId = groupId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public void setAceite(int aceite) {
        this.aceite = aceite;
    }

}

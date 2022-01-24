package com.pd.pd.model;

import java.time.LocalDateTime;

public class Message {

    private int id;
    private int AuthorId;
    private int ReceiverId;
    private int GroupId;
    private String type;
    private String msg;
    private LocalDateTime date;
    private String state;


    // Getters


    public int getId() {
        return id;
    }

    public int getAuthorId() {
        return AuthorId;
    }

    public int getReceiverId() {
        return ReceiverId;
    }

    public int getGroupId() {
        return GroupId;
    }

    public String getType() {
        return type;
    }

    public String getMsg() {
        return msg;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getState() {
        return state;
    }



    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthorId(int authorId) {
        AuthorId = authorId;
    }

    public void setReceiverId(int receiverId) {
        ReceiverId = receiverId;
    }

    public void setGroupId(int groupId) {
        GroupId = groupId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setState(String state) {
        this.state = state;
    }
}

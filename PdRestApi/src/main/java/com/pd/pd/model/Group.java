package com.pd.pd.model;

import javax.persistence.*;


public class Group {

    private int id;
    private int AdminId;
    private String nome;


    //Getters

    public int getId() {
        return id;
    }

    public int getAdminId() {
        return AdminId;
    }

    public String getNome() {
        return nome;
    }



    //Setters

    public void setId(int id) {
        this.id = id;
    }


    public void setAdminId(int adminId) {
        AdminId = adminId;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

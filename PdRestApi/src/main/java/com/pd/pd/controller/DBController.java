package com.pd.pd.controller;

import com.pd.pd.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;


@RestController

public class DBController {






    @PostMapping("session")
    public String login(@RequestParam String username,@RequestParam String password) throws SQLException {

       if(username != null && password != null){

           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","sql098");

           Statement statement = connection.createStatement();

           ResultSet resultSet = statement.executeQuery("SELECT * FROM utilizador");

           Boolean confirm = checkLoginData(username,password,resultSet);

           if(confirm){

               String token = username + "_123";
               return token;
           }
           else{
               return "Login failed!";
           }
       }else{
           return "No credentials provided!";
       }



    }

    public Boolean checkLoginData(String username,String password, ResultSet resultSet) throws SQLException {

        while(resultSet.next()){
            if(username.equals(resultSet.getString("username")) && password.equals(resultSet.getString("password"))){
                return true;
            }
        }

        return false;
    }


    @GetMapping("User/Contacts")
    public ArrayList<String> getContactRequests(@RequestParam(value="id", required=false)int id) throws SQLException {

        ArrayList<Integer> ContactsIds = new ArrayList<>();
        ArrayList<User> Contacts = new ArrayList<>();
        ArrayList<String> usernames = new ArrayList<>();

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/3306/mydb","root","sql098");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * from  utilizador_has_utilizador WHERE Utilizador_idUtilizadores ="+ id + " OR Utilizador_idUtilizadores =" + id + " AND aceite =1");

        while(resultSet.next()){
            if(resultSet.getInt("Utilizador_idUtilizadores") == id){
                ContactsIds.add(resultSet.getInt("Utilizador_idUtilizadores1"));
            }
            else if(resultSet.getInt("Utilizador_idUtilizadores1") == id){
                ContactsIds.add(resultSet.getInt("Utilizador_idUtilizadores"));
            }
        }


        ResultSet resultSet1 = statement.executeQuery("SELECT * FROM utilizador");

        while(resultSet1.next()){

            for(int i = 0; i < ContactsIds.size(); i++){

                if(ContactsIds.get(i) == resultSet1.getInt("idUtilizadores")){
                    Contacts.add(new User(resultSet1.getInt("idUtilizadores"),resultSet1.getString("username")));
                    usernames.add(resultSet1.getString("username"));
                }
            }
        }

        return usernames;
    }




}

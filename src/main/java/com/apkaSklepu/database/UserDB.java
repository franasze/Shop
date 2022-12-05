package com.apkaSklepu.database;

import com.apkaSklepu.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDB {

    private final User[] users = new User[10];


    public UserDB(){
        this.users[0] = new User("admin","123","ADMIN");
    }

    public User findByLogin(String login){
        for(User user : this.users){
            if(user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    public void giveAdminStatus(){

    }

}

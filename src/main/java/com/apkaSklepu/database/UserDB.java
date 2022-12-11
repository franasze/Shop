package com.apkaSklepu.database;

import com.apkaSklepu.Registration;
import com.apkaSklepu.model.User;


public class UserDB {

    private User[] users = new User[1];
    private static final UserDB instance = new UserDB();


    public UserDB() {
        this.users[0] = new User("admin", "", User.Role.ADMIN);
    }

    public User[] getUsers() {
        return users;
    }

    public User findByLogin(String login) {
        for (User user : this.users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    public static UserDB getInstance(){
        return instance;
    }
    public void register(User user){
        User[] newUsers = new User[this.users.length + 1];
        for(int i = 0; i < this.users.length; i++) {
            newUsers[i] = this.users[i];
        }
        newUsers[newUsers.length - 1] = user;
        this.users = newUsers;
    }

    public boolean ifUserExist(String login) {
        for (User user : this.users){
            if(user.getLogin().equals(login)){
                return true;
            }
        }
        return false;
    }
}


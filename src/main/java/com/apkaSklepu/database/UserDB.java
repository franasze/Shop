package com.apkaSklepu.database;

import com.apkaSklepu.Registration;
import com.apkaSklepu.model.User;


public class UserDB {

    private final User[] users = new User[1];
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
}


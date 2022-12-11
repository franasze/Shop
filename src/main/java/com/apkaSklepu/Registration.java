package com.apkaSklepu;

import com.apkaSklepu.database.UserDB;
import com.apkaSklepu.model.User;


public class Registration {
    static final UserDB userDB = UserDB.getInstance();

    public static User createNewUser() {

        User newUser = new User();
        boolean registered = false;
        while(!registered) {
            newUser = GUI.readLoginAndPassword();
            if(!userDB.ifUserExist(newUser.getLogin()))
                registered = true;
        }
        GUI.showEffectRegistration(registered);
        return newUser;

    }
}

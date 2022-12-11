package com.apkaSklepu;

import com.apkaSklepu.database.UserDB;
import com.apkaSklepu.model.User;

import java.util.Scanner;

public class Registration {
    static final UserDB userDB = UserDB.getInstance();

    private static final Scanner scanner = new Scanner(System.in);

    public static User createNewUser() {

        User newUser = new User();
        boolean registred = false;
        while(!registred) {
            newUser = GUI.readLoginAndPassword();
            if(!userDB.ifUserExist(newUser.getLogin()))
                registred = true;
        }
        GUI.showEffectRegistration(registred);
        return newUser;

    }
}

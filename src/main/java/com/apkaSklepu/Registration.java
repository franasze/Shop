package com.apkaSklepu;

import com.apkaSklepu.model.User;

import java.util.Scanner;

public class Registration {

    private static final Scanner scanner = new Scanner(System.in);

    public static User createNewUser() {
        User newUser = new User();
        System.out.println("Login:");
        newUser.setLogin(scanner.nextLine());
        System.out.println("Password:");
        newUser.setPassword(scanner.nextLine());
        return newUser;

    }
}

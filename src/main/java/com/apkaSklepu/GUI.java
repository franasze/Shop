package com.apkaSklepu;

import com.apkaSklepu.database.ProductDB;
import com.apkaSklepu.model.User;

import java.util.Scanner;

public class GUI {

    private static final Scanner scanner = new Scanner(System.in);
    final Authenticator authenticator = Authenticator.getInstance();
    final ProductDB productDB = ProductDB.getInstance();
    private static final GUI instance = new GUI();

    private GUI() {
    }
    public static String logMenu(){
        System.out.println("1.Registration");
        System.out.println("2.Login");
        System.out.println("3. Exit");
        return scanner.nextLine();
    }

    public static String showMenu(){
        System.out.println("1. Buy product");
        System.out.println("2. Logout");

        if (this.authenticator.loggedUser != null &&
                this.authenticator.loggedUser.getRole().equals(User.Role.ADMIN)) {
            System.out.println("3. Add product");
            System.out.println("4. Give admin status");
        }
        return scanner.nextLine();
    }

    public static User readLoginAndPassword(){
        User user = new User();
        System.out.println("Login:");
        user.setLogin(scanner.nextLine());
        System.out.println("Password:");
        user.setPassword(scanner.nextLine());
        return user;
    }


}

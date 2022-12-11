package com.apkaSklepu;

import com.apkaSklepu.database.ProductDB;
import com.apkaSklepu.model.User;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Scanner;

public class GUI {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Authenticator authenticator = Authenticator.getInstance();
    final ProductDB productDB = ProductDB.getInstance();
    private static final GUI instance = new GUI();

    private GUI() {
    }
    public static String showLogMenu(){
        System.out.println("1.Registration");
        System.out.println("2.Login");
        System.out.println("3. Exit");
        return scanner.nextLine();
    }

    public static String showMenu(){
        System.out.println("1. Buy product");
        System.out.println("2. Logout");

        if (authenticator.loggedUser != null &&
                authenticator.loggedUser.getRole().equals(User.Role.ADMIN)) {
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
        user.setPassword(DigestUtils.md5Hex(scanner.nextLine() + authenticator.getSeed()));
        return user;
    }
    public static String readName() {
        System.out.println("Product name:");
        return scanner.nextLine();
    }
    public static String readQunatity() {
        System.out.println("Product quantity:");
        return scanner.nextLine();
    }
    public static String readUser(){
        System.out.println("User name:");
        return scanner.nextLine();
    }

    public static void showEffectRegistration(boolean effect){
        if(effect)
            System.out.println("Registered successful");
        else
            System.out.println("login is taken, please try again");
    }
}

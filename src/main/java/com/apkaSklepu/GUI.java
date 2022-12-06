package com.apkaSklepu;

import com.apkaSklepu.database.ProductDB;
import com.apkaSklepu.model.User;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GUI {

    private static final Scanner scanner = new Scanner(System.in);


    public static String showMenu2(){
        System.out.println("1.Registration");
        System.out.println("2.Login");
        return scanner.nextLine();
    }

    public static String showMenu(){
        System.out.println("1. Buy product");
        System.out.println("2. Exit");

        System.out.println("3. Add product");
        System.out.println("4. Give admin status");

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
    public void buy(){
        System.out.println("1.Butter");
        System.out.println("2.Cheese");
        System.out.println("3.Eggs");
        System.out.println("4.Milk");
        System.out.println("5.Mustard");
        String choose = scanner.nextLine();
        switch (choose){
            case "1":
                //odejmowanie
        }
    }
    public static int addProduct(){//!!!
        System.out.println("Change quantity of product");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        return quantity;
    }

}

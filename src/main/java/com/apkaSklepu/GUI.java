package com.apkaSklepu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GUI {

    private static final Scanner scanner = new Scanner(System.in);



    public static String showMenu(){
        System.out.println("1. Buy product");
        System.out.println("2. Exit");

        System.out.println("3. Add product");
        System.out.println("4. Give admin status");

        return scanner.nextLine();
    }
}

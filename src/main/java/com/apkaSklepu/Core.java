package com.apkaSklepu;

import com.apkaSklepu.database.ProductDB;
import com.apkaSklepu.database.UserDB;

public class Core {

    public static void start() {
        final ProductDB productDB = new ProductDB();
        final UserDB userDB = new UserDB();
        boolean isRunning = false;


        while (!isRunning) {
            switch (GUI.showMenu2()) {
                case "1":
                   // Registration.createNewUser(); ???????
                   // UserDB.addUser();
                    break;
                case "2":
                    Authenticator.authenticate(GUI.readLoginAndPassword(), userDB);
                    isRunning = Authenticator.loggedUser != null;
                    if (!isRunning) {
                        System.out.println("Not authorized !");
                    }
            }
        }

        while(isRunning) {
            switch (GUI.showMenu()){
                case "1":
//buy
                    break;
                case "2":
                    System.exit(0);
                    break;
                case "3":
                    if(Authenticator.loggedUser != null && Authenticator
                            .loggedUser.getRole().equals("ADMIN")) {
                        GUI.addProduct();//!!!
                    }
                    break;
                case "4":
                    if(Authenticator.loggedUser != null && Authenticator
                            .loggedUser.getRole().equals("ADMIN")) {
                        //...
                    }
                    break;
                default:
                    System.out.println("Wrong choose!");
                    break;
            }
        }
    }
}

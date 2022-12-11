package com.apkaSklepu;

import com.apkaSklepu.database.ProductDB;
import com.apkaSklepu.database.UserDB;

public class Core {

    public static void start() {
        final ProductDB productDB = new ProductDB();
        final UserDB userDB = UserDB.getInstance();
        final Authenticator authenticator = Authenticator.getInstance();
        boolean isRunning = false;


        while (!isRunning) {
            switch (GUI.logMenu()) {
                case "1":
                    Registration.createNewUser()
                    break;
                case "2":
                    authenticator.authenticate(GUI.readLoginAndPassword());
                    isRunning = authenticator.loggedUser != null;
                    if (!isRunning) {
                        System.out.println("Not authorized !");
                    }
                case "3":
                    System.exit(0);
                default:
                    System.out.println("Wrong choose !!");
                    break;
            }
        }

        while(isRunning) {
            switch (GUI.showMenu()){
                case "1":

                    break;
                case "2":

                    break;
                case "3":
                    if(authenticator.loggedUser != null && Authenticator
                            .loggedUser.getRole().equals("ADMIN")) {

                    }
                    break;
                case "4":
                    if(authenticator.loggedUser != null && Authenticator
                            .loggedUser.getRole().equals("ADMIN")) {

                    }
                    break;
                default:
                    System.out.println("Wrong choose!");
                    break;
            }
        }
    }
}

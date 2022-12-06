package com.apkaSklepu.database;

import com.apkaSklepu.Registration;
import com.apkaSklepu.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDB {

    private final User[] users = new User[10];


    public UserDB(){
        this.users[0] = new User("admin","123","ADMIN");
    }

    public User findByLogin(String login){
        for(User user : this.users){
            if(user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    public void giveAdminStatus(){
//!!!
    }

//    public void addUser(){
//        List usersList = new ArrayList (Arrays.asList(users));
//        usersList.add(Registration.createNewUser());
//    }

}


        // Integer odd_Array[] = { 1,3,7,9,11 };
        // System.out.println('Original Array:' + Arrays.toString(odd_Array));
        // element to be added at index
        // int val = 5;
        // int index = 2;
        // dest array with size more than 1 of the original array
        // int[] dest_Array = new int[odd_Array.length+1]; int j = 0;
        // Iterate dest_array and insert new element as well as shift other elements to the right for(int i = 0; i







        // Original array with size 5
            // Integer odd_Array[] = { 1,3,5,7,9 };
            // display the original array
            // System.out.println('Original Array:' + Arrays.toString(odd_Array));
            // element to be added
            // int val = 11; // convert array to Arraylist
            // List oddlist = new ArrayList (Arrays.asList(odd_Array));
            // Add the new element oddlist.add(val);
            // Convert the Arraylist back to array
            // odd_Array = oddlist.toArray(odd_Array);

        // display the updated array
            // System.out.println(' Array after adding element ' + val + ':' + Arrays.toString(odd_Array));
        // }

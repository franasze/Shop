package com.apkaSklepu;

import com.apkaSklepu.database.UserDB;
import com.apkaSklepu.model.User;
import org.apache.commons.codec.digest.DigestUtils;

public class Authenticator {

    public static User loggedUser = null;

    public static final String seed = "12312312312312asdqw1@r";

    public static void authenticate(User user, UserDB userDB){
        User userFromDB = userDB.findByLogin(user.getLogin());
        if(userFromDB !=null &&
                userFromDB.getPassword().equals(
                        DigestUtils.md5Hex(user.getPassword() + seed))) {
            loggedUser = userFromDB;
        }
    }
}
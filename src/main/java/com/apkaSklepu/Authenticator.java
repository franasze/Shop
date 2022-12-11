package com.apkaSklepu;

import com.apkaSklepu.database.UserDB;
import com.apkaSklepu.model.User;
import org.apache.commons.codec.digest.DigestUtils;

public class Authenticator {

    final UserDB userDB = UserDB.getInstance();
    private static final Authenticator instance = new Authenticator();

    private Authenticator() {

    }

    public void authenticate(User user) {
        User userFromDB = this.userDB.findByLogin(user.getLogin());
        if(userFromDB != null &&
                userFromDB.getPassword().equals(
                        DigestUtils.md5Hex(user.getPassword() + this.seed))) {
            this.loggedUser = userFromDB;
        }
    }

    public User loggedUser = null;

    public static final String seed = "12312312312312asdqw1@r";

     static Authenticator getInstance() {
        return instance;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public String getSeed() {
        return seed;
    }
}
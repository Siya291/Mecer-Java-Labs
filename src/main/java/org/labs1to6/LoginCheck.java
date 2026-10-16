package org.labs1to6;

import java.util.Objects;

public class LoginCheck {

    String storedUserName = "Siyabonga";
    String storedPassWord = "Aniela";
    String inputUserName = "Lona";
    String inputPassword = "Ngobs";



    public void loginValidation() {
        if (Objects.equals(storedUserName, inputUserName)) {
            if (Objects.equals(storedPassWord, inputPassword)) {
                System.out.println("Login successful");
            }
        }else {
            System.out.println("Invalid credentials");
        }
    }
}

package com.algaworks.algamoney.api.garbage;

import java.util.Base64;

public class PasswordGenerator {

    public static void main(String[] args) {

        String originalInput = "admin@algamoney.com:admin";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println(encodedString);

    }

}

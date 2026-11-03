package SupplierInterface.Project;

import java.util.function.Supplier;

public class PasswordGenerator {

    Supplier<Integer> digit = () -> (int) (Math.random() * 10);

    String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";

    Supplier<Character> character = () ->
            symbols.charAt((int) (Math.random() * symbols.length()));

    Supplier<String> password = () -> {
        String pwd = "";

        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                pwd = pwd + digit.get();
            } else {
                pwd = pwd + character.get();
            }
        }

        return pwd;
    };

    public String generatePassword() {
        return password.get();
    }
}
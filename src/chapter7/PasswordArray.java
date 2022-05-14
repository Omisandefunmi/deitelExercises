package chapter7;

import java.security.SecureRandom;

public class PasswordArray {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();



        String[] passwordCharacters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X",
                "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < 12; i++) {
            int generate = secureRandom.nextInt(62);
            System.out.print(passwordCharacters[generate]);
        }


    }
}


package by.emall.yatsevich.components.utils.generators;

import java.util.Random;

public class PasswordGenerator {

    private static final String PASSWORD_CHARS = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%-^&*()_+~\"№;%:?=[]{}|/,.'<>";
    private static final int DEFAULT_LENGTH_FOR_GENERATED_PASSWORD = 8;

    public static String generatePassword() {
        return generatePassword(DEFAULT_LENGTH_FOR_GENERATED_PASSWORD);
    }

    public static String generatePassword(int length) {
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            builder.append(PASSWORD_CHARS.charAt(random.nextInt(PASSWORD_CHARS.length())));
        }
        return builder.toString();
    }
}

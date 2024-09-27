package by.emall.yatsevich.components.utils.generators;

import java.util.Random;

public class PasswordGenerator {

    private static final String PASSWORD_CHARS = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%-^&*()_+~\"№;%:?=[]{}|/,.'<>";
    private static final Random random = new Random();
    private static final StringBuilder builder = new StringBuilder();

    public static String generatePassword() {
        int length = 8;
        return generatePassword(length);
    }

    public static String generatePassword(int length) {
        builder.setLength(0);
        for (int i = 0; i < length; i++) {
            builder.append(PASSWORD_CHARS.charAt(random.nextInt(PASSWORD_CHARS.length())));
        }
        return builder.toString();
    }
}

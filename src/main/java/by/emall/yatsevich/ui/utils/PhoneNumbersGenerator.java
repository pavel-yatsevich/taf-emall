package by.emall.yatsevich.ui.utils;

import java.util.Random;

public class PhoneNumbersGenerator {
    private static final int[] OPERATOR_CODES = {25, 29, 33, 44};
    private static final StringBuilder stringBuilder = new StringBuilder();
    private static final Random random = new Random();

    public static String getValidNumberInternational() {
        stringBuilder.setLength(0);
        return stringBuilder.append("+375")
                .append(getCorrectOperatorCode())
                .append(getCorrectPhoneNumber())
                .toString();
    }

    public static String getValidNumberWithOperatorCode() {
        stringBuilder.setLength(0);
        return stringBuilder.append(getCorrectOperatorCode())
                .append(getCorrectPhoneNumber())
                .toString();
    }

    public static String getIncorrectNumberInvalidOperatorCodeValidNumber() {
        stringBuilder.setLength(0);
        return stringBuilder.append(getIncorrectOperatorCode())
                .append(getCorrectPhoneNumber())
                .toString();
    }

    public static String getIncorrectNumberValidOperatorCodeInvalidNumber() {
        stringBuilder.setLength(0);
        return stringBuilder.append(getCorrectOperatorCode())
                .append(getIncorrectPhoneNumber())
                .toString();
    }

    public static String getIncorrectNumberInvalidOperatorCodeInvalidNumber() {
        stringBuilder.setLength(0);
        return stringBuilder.append(getIncorrectOperatorCode())
                .append(getIncorrectPhoneNumber())
                .toString();
    }

    private static int getIncorrectOperatorCode() {
        int code;
        do {
            code = random.nextInt(10, 100);
        } while (code == 25 || code == 29 || code == 33 || code == 44);
        return code;
    }

    private static int getCorrectOperatorCode() {
        return OPERATOR_CODES[random.nextInt(OPERATOR_CODES.length)];
    }

    private static int getCorrectPhoneNumber() {
        return random.nextInt(100_00_00, 1_000_00_00);
    }

    private static String getIncorrectPhoneNumber() {
        return "0" + String.valueOf(random.nextInt(10_00_00, 100_00_00));
    }
}

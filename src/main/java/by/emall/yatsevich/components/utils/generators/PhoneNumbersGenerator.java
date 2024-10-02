package by.emall.yatsevich.components.utils.generators;

import java.util.Random;

import static by.emall.yatsevich.components.utils.generators.enums.OperatorsCodes.*;

public class PhoneNumbersGenerator {

    public static String getValidNumberInternational() {
        String countryCode = "+375";
        return countryCode + getCorrectOperatorCode() + getCorrectPhoneNumber();
    }

    public static String getValidNumberWithOperatorCode() {
        return String.valueOf(getCorrectOperatorCode()) +
                getCorrectPhoneNumber();
    }

    public static String getIncorrectNumberInvalidOperatorCodeValidNumber() {
        return String.valueOf(getIncorrectOperatorCode()) +
                getCorrectPhoneNumber();
    }

    public static String getIncorrectNumberValidOperatorCodeInvalidNumber() {
        return getCorrectOperatorCode() +
                getIncorrectPhoneNumber();
    }

    public static String getIncorrectNumberInvalidOperatorCodeInvalidNumber() {
        return getIncorrectOperatorCode() +
                getIncorrectPhoneNumber();
    }

    private static int getIncorrectOperatorCode() {
        int code;
        int minSize = 10;
        int maxSize = 100;
        do {
            code = new Random().nextInt(minSize, maxSize);
        } while (code == LIFE.getCode() || code == MTS_1.getCode()
                || code == MTS_2.getCode() || code == A1.getCode());
        return code;
    }

    private static int getCorrectOperatorCode() {
        return getAllCodes()[new Random().nextInt(getAllCodes().length)];
    }

    private static int getCorrectPhoneNumber() {
        int correctPhoneNumberMinSize = 100_00_00;
        int correctPhoneNumberMaxSize = 1_000_00_00;
        return new Random().nextInt(correctPhoneNumberMinSize, correctPhoneNumberMaxSize);
    }

    private static String getIncorrectPhoneNumber() {
        String invalidStartNumber = "0";
        int incorrectPhoneNumberMinSize = 10_00_00;
        int incorrectPhoneNumberMaxSize = 100_00_00;
        return invalidStartNumber + new Random().nextInt(incorrectPhoneNumberMinSize, incorrectPhoneNumberMaxSize);
    }
}

package by.emall.yatsevich.ui.utils;

import java.util.Random;

public class PhoneNumbersBuilder {

    private final StringBuilder phoneBuilder = new StringBuilder();
    private static final String COUNTRY_CODE = "+375";
    private static final int[] OPERATORS_CODES = {25, 29, 33, 44};
    private final Random random = new Random();

    public PhoneNumbersBuilder() {
    }

    public PhoneNumbersBuilder addCountryCode() {
        phoneBuilder.append(COUNTRY_CODE);
        return this;
    }

    public PhoneNumbersBuilder addCorrectOperatorCode() {
        phoneBuilder.append(getRandomCorrectOperatorCode());
        return this;
    }

    public PhoneNumbersBuilder addIncorrectOperatorCode() {
        phoneBuilder.append(getRandomIncorrectOperatorCode());
        return this;
    }

    public PhoneNumbersBuilder addCorrectPhoneNumber() {
        phoneBuilder.append(getRandomCorrectPhoneNumber());
        return this;
    }

    public PhoneNumbersBuilder addIncorrectPhoneNumber() {
        phoneBuilder
                .append(0)
                .append(getRandomIncorrectPhoneNumber());
        return this;
    }

    public String build(){
        return phoneBuilder.toString();
    }

    private int getRandomCorrectPhoneNumber() {
        return random.nextInt(100_00_00, 1_000_00_00);
    }

    private int getRandomIncorrectPhoneNumber() {
        return random.nextInt(10_00_00, 100_00_00);
    }

    private int getRandomIncorrectOperatorCode() {
        int incorrectCode;
        do {
            incorrectCode = random.nextInt(0, 100);
        } while (incorrectCode == 25 || incorrectCode == 29 || incorrectCode == 33 || incorrectCode == 44);
        return incorrectCode;
    }

    private int getRandomCorrectOperatorCode() {
        return OPERATORS_CODES[random.nextInt(OPERATORS_CODES.length)];
    }
}

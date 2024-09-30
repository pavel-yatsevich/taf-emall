package by.emall.yatsevich.api.utils.steps;

import by.emall.yatsevich.api.utils.RequestBodyBuilder;

import static by.emall.yatsevich.components.utils.generators.PhoneNumbersGenerator.*;
import static by.emall.yatsevich.components.utils.generators.PhoneNumbersGenerator.getIncorrectNumberValidOperatorCodeInvalidNumber;

public class LoginFormBySMSSteps {

    public static String getBodyWithCorrectPhoneNumber() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getValidNumberWithOperatorCode())
                .build();
    }

    public static String getBodyWithIncorrectNumberInvalidOperatorCodeInvalidNumber() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getIncorrectNumberInvalidOperatorCodeInvalidNumber())
                .build();
    }

    public static String getBodyWithIncorrectNumberInvalidOperatorCodeValidNumber() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getIncorrectNumberInvalidOperatorCodeValidNumber())
                .build();
    }

    public static String getBodyWithIncorrectNumberValidOperatorCodeInvalidNumber() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getIncorrectNumberValidOperatorCodeInvalidNumber())
                .build();
    }

}

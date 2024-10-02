package by.emall.yatsevich.api.steps;

import by.emall.yatsevich.api.utils.RequestBodyBuilder;

import static by.emall.yatsevich.components.utils.generators.PasswordGenerator.generatePassword;
import static by.emall.yatsevich.components.utils.generators.PhoneNumbersGenerator.*;

public class LoginFormByPasswordSteps {

    public static String getBodyWithEmptyFields() {
        return new RequestBodyBuilder()
                .setPhoneNumber("")
                .setPassword("")
                .build();
    }

    public static String getBodyWithEmptyPhoneNumberFilledPassword() {
        return new RequestBodyBuilder()
                .setPhoneNumber("")
                .setPassword(generatePassword())
                .build();
    }

    public static String getBodyWithCorrectPhoneNumberAndPassword() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getValidNumberWithOperatorCode())
                .setPassword(generatePassword())
                .build();
    }

    public static String getBodyWithIncorrectPhoneNumberAndFilledPasswordInvalidOperatorCodeInvalidNumber() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getIncorrectNumberInvalidOperatorCodeInvalidNumber())
                .setPassword(generatePassword())
                .build();
    }

    public static String getBodyWithIncorrectPhoneNumberAndFilledPasswordInvalidOperatorCodeValidNumber() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getIncorrectNumberInvalidOperatorCodeValidNumber())
                .setPassword(generatePassword())
                .build();
    }

    public static String getBodyWithIncorrectPhoneNumberAndFilledPasswordValidOperatorCodeInvalidNumber() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getIncorrectNumberValidOperatorCodeInvalidNumber())
                .setPassword(generatePassword())
                .build();
    }

    public static String getBodyWithCorrectPhoneNumberAndEmptyPassword() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getValidNumberWithOperatorCode())
                .setPassword("")
                .build();
    }

    public static String getBodyWithIncorrectPhoneNumberAndEmptyPasswordInvalidOperatorCodeInvalidNumber() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getIncorrectNumberInvalidOperatorCodeInvalidNumber())
                .setPassword("")
                .build();
    }

    public static String getBodyWithIncorrectPhoneNumberAndEmptyPasswordInvalidOperatorCodeValidNumber() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getIncorrectNumberInvalidOperatorCodeValidNumber())
                .setPassword("")
                .build();
    }

    public static String getBodyWithIncorrectPhoneNumberAndEmptyPasswordValidOperatorCodeInvalidNumber() {
        return new RequestBodyBuilder()
                .setPhoneNumber(getIncorrectNumberValidOperatorCodeInvalidNumber())
                .setPassword("")
                .build();
    }
}

package by.emall.yatsevich.ui.steps;

import by.emall.yatsevich.ui.page.EmallMainPage;

import static by.emall.yatsevich.components.utils.generators.PasswordGenerator.generatePassword;
import static by.emall.yatsevich.components.utils.generators.PhoneNumbersGenerator.*;

public class LoginFormByPasswordSteps {

    public static String goEmptyAllFields() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .clickLoginButton()
                .getErrorMessage();
    }

    public static String goValidPhoneNumber_EmptyPassword() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getValidNumberWithOperatorCode())
                .clickLoginButton()
                .getErrorMessage();
    }

    public static String goInvalidPhoneNumber_EmptyPassword_ValidOperatorsCode_InvalidPhone() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberValidOperatorCodeInvalidNumber())
                .clickLoginButton()
                .getErrorMessage();

    }

    public static String goInvalidPhoneNumber_EmptyPassword_InvalidOperatorsCode_ValidPhone() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeValidNumber())
                .clickLoginButton()
                .getErrorMessage();

    }

    public static String goInvalidPhoneNumber_EmptyPassword_InvalidOperatorsCode_InvalidPhone() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeInvalidNumber())
                .clickLoginButton()
                .getErrorMessage();

    }

    public static String goEmptyPhonePhoneNumber_FilledPassword() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .clickSeePasswordButton()
                .enterPassword(generatePassword())
                .clickLoginButton()
                .getErrorMessage();

    }

    public static String goInvalidPhoneNumber_FilledPassword_ValidOperatorsCode_InvalidPhone() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberValidOperatorCodeInvalidNumber())
                .clickSeePasswordButton()
                .enterPassword(generatePassword())
                .clickLoginButton()
                .getErrorMessage();
    }

    public static String goInvalidPhoneNumber_FilledPassword_InvalidOperatorsCode_ValidPhone() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeValidNumber())
                .clickSeePasswordButton()
                .enterPassword(generatePassword())
                .clickLoginButton()
                .getErrorMessage();
    }

    public static String goInvalidPhoneNumber_FilledPassword_InvalidOperatorsCode_InvalidPhone() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeInvalidNumber())
                .clickSeePasswordButton()
                .enterPassword(generatePassword())
                .clickLoginButton()
                .getErrorMessage();
    }

    public static String goValidPhoneNumber_FilledPassword() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getValidNumberWithOperatorCode())
                .clickSeePasswordButton()
                .enterPassword(generatePassword())
                .clickLoginButton()
                .getErrorMessage();
    }
}

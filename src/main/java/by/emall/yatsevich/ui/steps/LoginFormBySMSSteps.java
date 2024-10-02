package by.emall.yatsevich.ui.steps;

import by.emall.yatsevich.ui.page.EmallMainPage;

import static by.emall.yatsevich.components.utils.generators.PhoneNumbersGenerator.*;

public class LoginFormBySMSSteps {

    public static String goEmptyPhoneNumberField() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickButtonGetCode()
                .getErrorMessage();
    }

    public static String goIncorrectPhoneNumberInField_ValidOperatorsCode_InvalidPhone() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .enterPhoneNumber(getIncorrectNumberValidOperatorCodeInvalidNumber())
                .clickButtonGetCode()
                .getErrorMessage();
    }

    public static String goIncorrectPhoneNumberInField_InvalidOperatorsCode_ValidPhone() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeValidNumber())
                .clickButtonGetCode()
                .getErrorMessage();
    }

    public static String goIncorrectPhoneNumberInField_InvalidOperatorsCode_InvalidPhone() {
        return new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeInvalidNumber())
                .clickButtonGetCode()
                .getErrorMessage();
    }
}

package by.emall.yatsevich;

import by.emall.yatsevich.ui.page.EmallMainPage;
import org.junit.jupiter.api.Test;

import static by.emall.yatsevich.ui.constants.ErrorMessageConstants.*;
import static by.emall.yatsevich.components.utils.PasswordGenerator.generatePassword;
import static by.emall.yatsevich.components.utils.PhoneNumbersGenerator.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginFormByPasswordTest extends BaseTest{

    @Test
    public void testEmptyAllFields() {
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .clickLoginButton()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_EMPTY_ALL_FIELDS_TEXT, actualErrorMessage);
    }

    @Test
    public void testValidPhoneNumber_EmptyPassword(){
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getValidNumberWithOperatorCode())
                .clickLoginButton()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_VALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, actualErrorMessage);
    }

    @Test
    public void testInvalidPhoneNumber_EmptyPassword_ValidOperatorsCode_InvalidPhone(){
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberValidOperatorCodeInvalidNumber())
                .clickLoginButton()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, actualErrorMessage);
    }

    @Test
    public void testInvalidPhoneNumber_EmptyPassword_InvalidOperatorsCode_ValidPhone(){
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeValidNumber())
                .clickLoginButton()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, actualErrorMessage);
    }

    @Test
    public void testInvalidPhoneNumber_EmptyPassword_InvalidOperatorsCode_InvalidPhone(){
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeInvalidNumber())
                .clickLoginButton()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, actualErrorMessage);
    }

    @Test
    public void testEmptyPhonePhoneNumber_FilledPassword(){
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .clickSeePasswordButton()
                .enterPassword(generatePassword())
                .clickLoginButton()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_EMPTY_PHONE_NUM_FIELD_TEXT, actualErrorMessage);
    }

    @Test
    public void testInvalidPhoneNumber_FilledPassword_ValidOperatorsCode_InvalidPhone(){
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberValidOperatorCodeInvalidNumber())
                .clickSeePasswordButton()
                .enterPassword(generatePassword())
                .clickLoginButton()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actualErrorMessage);
    }

    @Test
    public void testInvalidPhoneNumber_FilledPassword_InvalidOperatorsCode_ValidPhone(){
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeValidNumber())
                .clickSeePasswordButton()
                .enterPassword(generatePassword())
                .clickLoginButton()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actualErrorMessage);
    }

    @Test
    public void testInvalidPhoneNumber_FilledPassword_InvalidOperatorsCode_InvalidPhone(){
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeInvalidNumber())
                .clickSeePasswordButton()
                .enterPassword(generatePassword())
                .clickLoginButton()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actualErrorMessage);
    }

    @Test
    public void testValidPhoneNumber_FilledPassword(){
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickEnterByPasswordButton()
                .enterPhoneNumber(getValidNumberWithOperatorCode())
                .clickSeePasswordButton()
                .enterPassword(generatePassword())
                .clickLoginButton()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_BAD_DATA_TEXT, actualErrorMessage);
    }
}

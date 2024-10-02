package by.emall.yatsevich.ui;

import by.emall.yatsevich.ui.page.EmallMainPage;
import org.junit.jupiter.api.Test;

import static by.emall.yatsevich.ui.constants.ErrorMessageConstants.ERROR_MESSAGE_EMPTY_PHONE_NUM_FIELD_TEXT;
import static by.emall.yatsevich.ui.constants.ErrorMessageConstants.ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT;
import static by.emall.yatsevich.components.utils.generators.PhoneNumbersGenerator.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginFormBySMSTest extends BaseTest {


    @Test
    public void testEmptyPhoneNumberField() {
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .clickButtonGetCode()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_EMPTY_PHONE_NUM_FIELD_TEXT, actualErrorMessage);
    }

    @Test
    public void testIncorrectPhoneNumberInField_ValidOperatorsCode_InvalidPhone() {
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .enterPhoneNumber(getIncorrectNumberValidOperatorCodeInvalidNumber())
                .clickButtonGetCode()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actualErrorMessage);
    }

    @Test
    public void testIncorrectPhoneNumberInField_InvalidOperatorsCode_ValidPhone() {
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeValidNumber())
                .clickButtonGetCode()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actualErrorMessage);
    }

    @Test
    public void testIncorrectPhoneNumberInField_InvalidOperatorsCode_InvalidPhone() {
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickAcceptCookiesButton()
                .clickLoginFormButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeInvalidNumber())
                .clickButtonGetCode()
                .getErrorMessage();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actualErrorMessage);
    }
}

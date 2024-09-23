package by.emall.yatsevich;

import by.emall.yatsevich.ui.constants.ErrorMessageConstants;
import by.emall.yatsevich.ui.page.EmallMainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static by.emall.yatsevich.ui.utils.PhoneNumbersGenerator.*;

public class LoginFormBySMSTest extends BaseTest {

    private String actualErrorMessage;

    @Test
    public void testEmptyPhoneNumberField() {
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickTheButtonAcceptCookies()
                .clickToLoginFormButton()
                .clickButtonGetCode()
                .getErrorMessage();

        Assertions.assertEquals(ErrorMessageConstants.ERROR_MESSAGE_EMPTY_FIELD_TEXT, actualErrorMessage);
    }

    @Test
    public void testIncorrectPhoneNumberInField_ValidOperatorsCod_InvalidPhone() {
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickTheButtonAcceptCookies()
                .clickToLoginFormButton()
                .enterPhoneNumber(getIncorrectNumberValidOperatorCodeInvalidNumber())
                .clickButtonGetCode()
                .getErrorMessage();

        Assertions.assertEquals(ErrorMessageConstants.ERROR_MESSAGE_INVALID_PHONE_NUM_TEXT, actualErrorMessage);
    }

    @Test
    public void testIncorrectPhoneNumberInField_InvalidOperatorsCod_ValidPhone() {
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickTheButtonAcceptCookies()
                .clickToLoginFormButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeValidNumber())
                .clickButtonGetCode()
                .getErrorMessage();

        Assertions.assertEquals(ErrorMessageConstants.ERROR_MESSAGE_INVALID_PHONE_NUM_TEXT, actualErrorMessage);
    }

    @Test
    public void testIncorrectPhoneNumberInField_InvalidOperatorsCod_InvalidPhone() {
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickTheButtonAcceptCookies()
                .clickToLoginFormButton()
                .enterPhoneNumber(getIncorrectNumberInvalidOperatorCodeInvalidNumber())
                .clickButtonGetCode()
                .getErrorMessage();

        Assertions.assertEquals(ErrorMessageConstants.ERROR_MESSAGE_INVALID_PHONE_NUM_TEXT, actualErrorMessage);
    }
}

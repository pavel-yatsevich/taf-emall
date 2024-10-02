package by.emall.yatsevich.ui;

import org.junit.jupiter.api.Test;

import static by.emall.yatsevich.components.utils.constants.ErrorMessageConstants.ERROR_MESSAGE_EMPTY_PHONE_NUM_FIELD_TEXT;
import static by.emall.yatsevich.components.utils.constants.ErrorMessageConstants.ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT;
import static by.emall.yatsevich.ui.steps.LoginFormBySMSSteps.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginFormBySMSTest extends BaseTest {

    @Test
    public void testEmptyPhoneNumberField() {
        actual = goEmptyPhoneNumberField();

        assertEquals(ERROR_MESSAGE_EMPTY_PHONE_NUM_FIELD_TEXT, actual);
    }

    @Test
    public void testIncorrectPhoneNumberInField_ValidOperatorsCode_InvalidPhone() {
        actual = goIncorrectPhoneNumberInField_ValidOperatorsCode_InvalidPhone();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actual);
    }

    @Test
    public void testIncorrectPhoneNumberInField_InvalidOperatorsCode_ValidPhone() {
        actual = goIncorrectPhoneNumberInField_InvalidOperatorsCode_ValidPhone();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actual);
    }

    @Test
    public void testIncorrectPhoneNumberInField_InvalidOperatorsCode_InvalidPhone() {
        actual = goIncorrectPhoneNumberInField_InvalidOperatorsCode_InvalidPhone();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actual);
    }
}

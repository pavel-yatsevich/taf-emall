package by.emall.yatsevich.ui;

import org.junit.jupiter.api.Test;

import static by.emall.yatsevich.components.utils.constants.ErrorMessageConstants.*;
import static by.emall.yatsevich.ui.steps.LoginFormByPasswordSteps.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginFormByPasswordTest extends BaseTest {

    @Test
    public void testEmptyAllFields() {
        actual = goEmptyAllFields();

        assertEquals(ERROR_MESSAGE_EMPTY_ALL_FIELDS_TEXT, actual);
    }

    @Test
    public void testValidPhoneNumber_EmptyPassword() {
        actual = goValidPhoneNumber_EmptyPassword();

        assertEquals(ERROR_MESSAGE_VALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, actual);
    }

    @Test
    public void testInvalidPhoneNumber_EmptyPassword_ValidOperatorsCode_InvalidPhone() {
        actual = goInvalidPhoneNumber_EmptyPassword_ValidOperatorsCode_InvalidPhone();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, actual);
    }

    @Test
    public void testInvalidPhoneNumber_EmptyPassword_InvalidOperatorsCode_ValidPhone() {
        actual = goInvalidPhoneNumber_EmptyPassword_InvalidOperatorsCode_ValidPhone();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, actual);
    }

    @Test
    public void testInvalidPhoneNumber_EmptyPassword_InvalidOperatorsCode_InvalidPhone() {
        actual = goInvalidPhoneNumber_EmptyPassword_InvalidOperatorsCode_InvalidPhone();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, actual);
    }

    @Test
    public void testEmptyPhonePhoneNumber_FilledPassword() {
        actual = goEmptyPhonePhoneNumber_FilledPassword();

        assertEquals(ERROR_MESSAGE_EMPTY_PHONE_NUM_FIELD_TEXT, actual);
    }

    @Test
    public void testInvalidPhoneNumber_FilledPassword_ValidOperatorsCode_InvalidPhone() {
        actual = goInvalidPhoneNumber_FilledPassword_ValidOperatorsCode_InvalidPhone();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actual);
    }

    @Test
    public void testInvalidPhoneNumber_FilledPassword_InvalidOperatorsCode_ValidPhone() {
        actual = goInvalidPhoneNumber_FilledPassword_InvalidOperatorsCode_ValidPhone();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actual);
    }

    @Test
    public void testInvalidPhoneNumber_FilledPassword_InvalidOperatorsCode_InvalidPhone() {
        actual = goInvalidPhoneNumber_FilledPassword_InvalidOperatorsCode_InvalidPhone();

        assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, actual);
    }

    @Test
    public void testValidPhoneNumber_FilledPassword() {
        actual = goValidPhoneNumber_FilledPassword();

        assertEquals(ERROR_MESSAGE_BAD_DATA_TEXT, actual);
    }
}

package by.emall.yatsevich;

import by.emall.yatsevich.ui.constants.ErrorMessageConstants;
import by.emall.yatsevich.ui.page.EmallMainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginFormByPasswordTest extends BaseTest{

    @Test
    public void testEmptyAllFields() {
        actualErrorMessage = new EmallMainPage()
                .openPage()
                .clickTheButtonAcceptCookies()
                .clickToLoginFormButton()
                .clickButtonEnterByPassword()
                .clickLoginButton()
                .getErrorMessage();

        Assertions.assertEquals(ErrorMessageConstants.ERROR_MESSAGE_EMPTY_ALL_FIELDS_TEXT, actualErrorMessage);
    }

    public void testEmptyPasswordField(){

    }

    public void testEmptyPhoneNumberField(){

    }
}

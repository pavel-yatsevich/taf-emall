package by.emall.yatsevich.api;

import by.emall.yatsevich.api.page.LoginFormByPassword;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static by.emall.yatsevich.api.utils.steps.LoginFormByPasswordSteps.*;

public class LoginFormByPasswordTest {

    @Test
    public void testEmptyBody_WithProperties() {
        Response response = new LoginFormByPassword().preformPostRequestWithProperties();
        response
                .then()
                .log().all();
    }

    @Test
    public void testEmptyBody_WithoutCookie() {
        Response response = new LoginFormByPassword().preformPostRequestWithoutCookie();
        response
                .then()
                .log().all();
    }

    @Test
    public void testEmptyBody_WithoutHeaders() {
        Response response = new LoginFormByPassword().preformPostRequestWithoutHeaders();
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_EmptyFields_WithProperties() {
        Response response = new LoginFormByPassword().preformPostRequestWithProperties(
                getBodyWithEmptyFields()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_EmptyPhoneNumberFilledPassword_WithProperties() {
        Response response = new LoginFormByPassword().preformPostRequestWithProperties(
                getBodyWithEmptyPhoneNumberFilledPassword()
        );
        response
                .then()
                .log().all();
    }
@Test
    public void testFilledBody_CorrectPhoneNumberAndPassword_WithProperties() {
        Response response = new LoginFormByPassword().preformPostRequestWithProperties(
                getBodyWithCorrectPhoneNumberAndPassword()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndFilledPassword_InvalidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormByPassword().preformPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndFilledPasswordInvalidOperatorCodeInvalidNumber()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndFilledPassword_ValidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormByPassword().preformPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndFilledPasswordValidOperatorCodeInvalidNumber()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndFilledPassword_InvalidOperatorCodeValidNumber_WithProperties() {
        Response response = new LoginFormByPassword().preformPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndFilledPasswordInvalidOperatorCodeValidNumber()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_CorrectPhoneNumberAndEmptyPassword_WithProperties() {
        Response response = new LoginFormByPassword().preformPostRequestWithProperties(
                getBodyWithCorrectPhoneNumberAndEmptyPassword()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndEmptyPassword_InvalidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormByPassword().preformPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndEmptyPasswordInvalidOperatorCodeInvalidNumber()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndEmptyPassword_ValidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormByPassword().preformPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndEmptyPasswordValidOperatorCodeInvalidNumber()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndEmptyPassword_InvalidOperatorCodeValidNumber_WithProperties() {
        Response response = new LoginFormByPassword().preformPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndEmptyPasswordInvalidOperatorCodeValidNumber()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_CorrectPhoneNumberAndFilledPassword_WithoutCookie() {
        Response response = new LoginFormByPassword().preformPostRequestWithoutCookie(
                getBodyWithCorrectPhoneNumberAndPassword()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_CorrectPhoneNumberAndFilledPassword_WithoutHeaders() {
        Response response = new LoginFormByPassword().preformPostRequestWithoutHeaders(
                getBodyWithCorrectPhoneNumberAndPassword()
        );
        response
                .then()
                .log().all();
    }
}

package by.emall.yatsevich.api;

import by.emall.yatsevich.api.page.LoginFormBySmsPage;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static by.emall.yatsevich.api.utils.steps.LoginFormBySMSSteps.*;

public class LoginFormBySMSTest {

    @Test
    public void testEmptyBody_WithProperties() {
        Response response = new LoginFormBySmsPage().preformPostRequestWithProperties();
        response
                .then()
                .log().all();
    }

    @Test
    public void testEmptyBody_WithoutCookie() {
        Response response = new LoginFormBySmsPage().preformPostRequestWithoutCookie();
        response
                .then()
                .log().all();
    }

    @Test
    public void testEmptyBody_WithoutHeaders() {
        Response response = new LoginFormBySmsPage().preformPostRequestWithoutHeaders();
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_CorrectPhoneNumber_WithProperties() {
        Response response = new LoginFormBySmsPage().preformPostRequestWithProperties(
                getBodyWithCorrectPhoneNumber()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_IncorrectNumber_InvalidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormBySmsPage().preformPostRequestWithProperties(
                getBodyWithIncorrectNumberInvalidOperatorCodeInvalidNumber()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_IncorrectNumber_ValidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormBySmsPage().preformPostRequestWithProperties(
                getBodyWithIncorrectNumberValidOperatorCodeInvalidNumber()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_IncorrectNumber_InvalidOperatorCodeValidNumber_WithProperties() {
        Response response = new LoginFormBySmsPage().preformPostRequestWithProperties(
                getBodyWithIncorrectNumberInvalidOperatorCodeValidNumber()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_CorrectPhoneNumber_WithoutCookie() {
        Response response = new LoginFormBySmsPage().preformPostRequestWithoutCookie(
                getBodyWithCorrectPhoneNumber()
        );
        response
                .then()
                .log().all();
    }

    @Test
    public void testFilledBody_CorrectPhoneNumber_WithoutHeaders() {
        Response response = new LoginFormBySmsPage().preformPostRequestWithoutHeaders(
                getBodyWithCorrectPhoneNumber()
        );
        response
                .then()
                .log().all();
    }
}

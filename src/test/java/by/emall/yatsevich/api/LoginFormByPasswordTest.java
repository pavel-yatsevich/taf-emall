package by.emall.yatsevich.api;

import by.emall.yatsevich.api.dto.ResponseDTO;
import by.emall.yatsevich.api.page.LoginFormByPassword;
import by.emall.yatsevich.api.utils.JsonConverter;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static by.emall.yatsevich.api.steps.LoginFormByPasswordSteps.*;
import static by.emall.yatsevich.components.utils.constants.ErrorMessageConstants.*;
import static org.apache.http.HttpStatus.SC_UNAUTHORIZED;
import static org.apache.http.HttpStatus.SC_UNPROCESSABLE_ENTITY;

public class LoginFormByPasswordTest {

    @Test
    public void testEmptyBody_WithProperties() {
        Response response = new LoginFormByPassword().performPostRequestWithProperties();
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_EMPTY_ALL_FIELDS_TEXT, responseDTO.getErrors().toString());
    }
    @Test
    public void testWithoutBody_WithoutProperties() {
        Response response = new LoginFormByPassword().performEmptyPostRequest();
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNAUTHORIZED, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_NO_AUTH_TOKEN, responseDTO.getMessage());
    }

    @Test
    public void testEmptyBody_WithoutCookie() {
        Response response = new LoginFormByPassword().performPostRequestWithoutCookie();
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_EMPTY_ALL_FIELDS_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testEmptyBody_WithoutHeaders() {
        Response response = new LoginFormByPassword().performPostRequestWithoutHeaders();
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNAUTHORIZED, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_NO_AUTH_TOKEN, responseDTO.getMessage());
    }

    @Test
    public void testFilledBody_CorrectPhoneNumberAndFilledPassword_WithoutCookie() {
        Response response = new LoginFormByPassword().performPostRequestWithoutCookie(
                getBodyWithCorrectPhoneNumberAndPassword()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNAUTHORIZED, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_BAD_DATA_TEXT, responseDTO.getMessage());
    }

    @Test
    public void testFilledBody_CorrectPhoneNumberAndFilledPassword_WithoutHeaders() {
        Response response = new LoginFormByPassword().performPostRequestWithoutHeaders(
                getBodyWithCorrectPhoneNumberAndPassword()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNAUTHORIZED, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_NO_AUTH_TOKEN, responseDTO.getMessage());
    }

    @Test
    public void testFilledBody_EmptyFields_WithProperties() {
        Response response = new LoginFormByPassword().performPostRequestWithProperties(
                getBodyWithEmptyFields()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testFilledBody_EmptyPhoneNumberFilledPassword_WithProperties() {
        Response response = new LoginFormByPassword().performPostRequestWithProperties(
                getBodyWithEmptyPhoneNumberFilledPassword()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testFilledBody_CorrectPhoneNumberAndPassword_WithProperties() {
        Response response = new LoginFormByPassword().performPostRequestWithProperties(
                getBodyWithCorrectPhoneNumberAndPassword()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNAUTHORIZED, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_BAD_DATA_TEXT, responseDTO.getMessage());
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndFilledPassword_InvalidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormByPassword().performPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndFilledPasswordInvalidOperatorCodeInvalidNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndFilledPassword_ValidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormByPassword().performPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndFilledPasswordValidOperatorCodeInvalidNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndFilledPassword_InvalidOperatorCodeValidNumber_WithProperties() {
        Response response = new LoginFormByPassword().performPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndFilledPasswordInvalidOperatorCodeValidNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testFilledBody_CorrectPhoneNumberAndEmptyPassword_WithProperties() {
        Response response = new LoginFormByPassword().performPostRequestWithProperties(
                getBodyWithCorrectPhoneNumberAndEmptyPassword()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_VALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndEmptyPassword_InvalidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormByPassword().performPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndEmptyPasswordInvalidOperatorCodeInvalidNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndEmptyPassword_ValidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormByPassword().performPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndEmptyPasswordValidOperatorCodeInvalidNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testFilledBody_IncorrectPhoneNumberAndEmptyPassword_InvalidOperatorCodeValidNumber_WithProperties() {
        Response response = new LoginFormByPassword().performPostRequestWithProperties(
                getBodyWithIncorrectPhoneNumberAndEmptyPasswordInvalidOperatorCodeValidNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_EMPTY_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }

}

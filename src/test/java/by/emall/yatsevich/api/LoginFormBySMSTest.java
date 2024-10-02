package by.emall.yatsevich.api;

import by.emall.yatsevich.api.dto.ResponseDTO;
import by.emall.yatsevich.api.page.LoginFormBySms;
import by.emall.yatsevich.api.utils.JsonConverter;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static by.emall.yatsevich.api.utils.steps.LoginFormBySMSSteps.*;
import static by.emall.yatsevich.components.utils.constants.ErrorMessageConstants.*;
import static org.apache.http.HttpStatus.*;

public class LoginFormBySMSTest {

    @Test
    public void testEmptyBody_WithProperties() {
        Response response = new LoginFormBySms().performPostRequestWithProperties();
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_EMPTY_PHONE_NUM_FIELD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testEmptyBody_WithoutCookie() {
        Response response = new LoginFormBySms().performPostRequestWithoutCookie();
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_EMPTY_PHONE_NUM_FIELD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testEmptyBody_WithoutHeaders() {
        Response response = new LoginFormBySms().performPostRequestWithoutHeaders();
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNAUTHORIZED, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_NO_AUTH_TOKEN, responseDTO.getMessage());
    }

    @Test
    public void testFilledBody_CorrectPhoneNumber_WithoutCookie() {
        Response response = new LoginFormBySms().performPostRequestWithoutCookie(
                getBodyWithCorrectPhoneNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_BAD_REQUEST, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_PHONE_NUMBER, responseDTO.getMessage());
    }

    @Test
    public void testFilledBody_CorrectPhoneNumber_WithoutHeaders() {
        Response response = new LoginFormBySms().performPostRequestWithoutHeaders(
                getBodyWithCorrectPhoneNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNAUTHORIZED, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_NO_AUTH_TOKEN, responseDTO.getMessage());
    }

    @Test
    public void testWithoutBody_WithoutProperties() {
        Response response = new LoginFormBySms().performEmptyPostRequest();
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNAUTHORIZED, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_NO_AUTH_TOKEN, responseDTO.getMessage());
    }

    @Test
    public void testFilledBody_CorrectPhoneNumber_WithProperties() {
        Response response = new LoginFormBySms().performPostRequestWithProperties(
                getBodyWithCorrectPhoneNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_BAD_REQUEST, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_PHONE_NUMBER, responseDTO.getMessage());
    }

    @Test
    public void testFilledBody_IncorrectNumber_InvalidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormBySms().performPostRequestWithProperties(
                getBodyWithIncorrectNumberInvalidOperatorCodeInvalidNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testFilledBody_IncorrectNumber_ValidOperatorCodeInvalidNumber_WithProperties() {
        Response response = new LoginFormBySms().performPostRequestWithProperties(
                getBodyWithIncorrectNumberValidOperatorCodeInvalidNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }

    @Test
    public void testFilledBody_IncorrectNumber_InvalidOperatorCodeValidNumber_WithProperties() {
        Response response = new LoginFormBySms().performPostRequestWithProperties(
                getBodyWithIncorrectNumberInvalidOperatorCodeValidNumber()
        );
        ResponseDTO responseDTO = JsonConverter.getResponseDTOFromJson(response.asString());

        Assertions.assertEquals(SC_UNPROCESSABLE_ENTITY, response.getStatusCode());
        Assertions.assertEquals(ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT, responseDTO.getErrors().toString());
    }
}

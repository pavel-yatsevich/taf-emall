package by.emall.yatsevich.api;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoginFormBySMSTest {

    @Test
    public void testEmptyPhoneNumberField() {
        String BASE_URL = "https://api-preprod.emall.by/api/v1/auth/sms";

        String body = "{\"phone\":\"\"}";

        Map<String,String> headers = new HashMap<>();
        headers.put("content-type","application/json");
        given()
                .headers(headers)
                .body(body)

                .when()
                    .post(BASE_URL)
                .then()
                .log().all();
    }
}

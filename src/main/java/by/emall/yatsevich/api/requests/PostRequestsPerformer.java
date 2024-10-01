package by.emall.yatsevich.api.requests;

import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public interface PostRequestsPerformer {
    Headers getHeaders();
    Cookie getCookie();
    String getPath();
    void setBaseURL();

    default Response preformPostRequestWithProperties() {
        return given()
                .headers(getHeaders())
                .cookie(getCookie())
                .when()
                .post(getPath());
    }

    default Response preformPostRequestWithProperties(String body) {
        return given()
                .headers(getHeaders())
                .cookie(getCookie())
                .body(body)
                .when()
                .post(getPath());
    }

    default Response preformPostRequestWithoutHeaders() {
        return given()
                .cookie(getCookie())
                .when()
                .post(getPath());
    }

    default Response preformPostRequestWithoutHeaders(String body) {
        return given()
                .cookie(getCookie())
                .body(body)
                .when()
                .post(getPath());
    }

    default Response preformPostRequestWithoutCookie() {
        return given()
                .cookie(getCookie())
                .when()
                .post(getPath());
    }

    default Response preformPostRequestWithoutCookie(String body) {
        return given()
                .cookie(getCookie())
                .body(body)
                .when()
                .post(getPath());
    }

    default Response preformEmptyPostRequest() {
        return RestAssured
                .when()
                .post(getPath());
    }
}

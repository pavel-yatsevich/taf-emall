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

    default Response performPostRequestWithProperties() {
        return given()
                .headers(getHeaders())
                .cookie(getCookie())
                .when()
                .post(getPath());
    }

    default Response performPostRequestWithProperties(String body) {
        return given()
                .headers(getHeaders())
                .cookie(getCookie())
                .body(body)
                .when()
                .post(getPath());
    }

    default Response performPostRequestWithoutHeaders() {
        return given()
                .cookie(getCookie())
                .when()
                .post(getPath());
    }

    default Response performPostRequestWithoutHeaders(String body) {
        return given()
                .cookie(getCookie())
                .body(body)
                .when()
                .post(getPath());
    }

    default Response performPostRequestWithoutCookie() {
        return given()
                .headers(getHeaders())
                .when()
                .post(getPath());
    }

    default Response performPostRequestWithoutCookie(String body) {
        return given()
                .headers(getHeaders())
                .body(body)
                .when()
                .post(getPath());
    }

    default Response performEmptyPostRequest() {
        return RestAssured
                .when()
                .post(getPath());
    }
}

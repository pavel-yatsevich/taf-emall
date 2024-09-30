package by.emall.yatsevich.api.page;

import by.emall.yatsevich.api.requests.PostRequestsPerformer;
import by.emall.yatsevich.api.utils.RequestConfigurer;
import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class BasePage implements PostRequestsPerformer {

    private static final String API_TOKEN_URL = "https://emall.by";
    private final Response configResponse;

    public BasePage() {
        configResponse = performGetConfigurationRequest();
    }

    @Override
    public Headers getHeaders() {
        return RequestConfigurer.getHeaders(configResponse);
    }

    @Override
    public Cookie getCookie() {
        return RequestConfigurer.getCookie(configResponse);
    }

    @Override
    public String getPath() {
        return API_TOKEN_URL;
    }

    private Response performGetConfigurationRequest() {
        return RestAssured
                .when()
                .get(getPath());
    }
}

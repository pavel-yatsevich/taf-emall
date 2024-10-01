package by.emall.yatsevich.api.page;

import by.emall.yatsevich.api.requests.PostRequestsPerformer;
import by.emall.yatsevich.api.utils.RequestConfigurer;
import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class BasePage implements PostRequestsPerformer {

    protected static final String BASE_API_URL = "https://api-preprod.emall.by/api/v1";
    private final Response configResponse;

    public BasePage() {
        configResponse = RequestConfigurer.performGetConfigurationRequest();
        RestAssured.baseURI = BASE_API_URL;
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
        return BASE_API_URL;
    }
}

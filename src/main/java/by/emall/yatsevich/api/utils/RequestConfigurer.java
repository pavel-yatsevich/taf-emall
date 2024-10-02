package by.emall.yatsevich.api.utils;

import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.apache.http.HttpHeaders;

public class RequestConfigurer {

    public static Headers getHeaders(Response response){
        String apiToken = "apitoken";
        String contentTypeValue = "application/json";
        return new Headers(
                new Header(HttpHeaders.CONTENT_TYPE, contentTypeValue),
                new Header(apiToken, getApiToken(response))
        );
    }

    public static String getApiToken(Response response) {
        String apiToken = "api_token";
        return response.getCookie(apiToken);
    }

    public static Cookie getCookie(Response response) {
        String hgClientSecurity = "hg-client-security";
        return new Cookie.Builder(hgClientSecurity, response.getCookie(hgClientSecurity)).build();
    }
}

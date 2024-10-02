package by.emall.yatsevich.api.requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public interface GetRequestsPerformer {

    default Response performGetConfigurationRequest(String url) {
        return RestAssured
                .when()
                .get(url);
    }
}

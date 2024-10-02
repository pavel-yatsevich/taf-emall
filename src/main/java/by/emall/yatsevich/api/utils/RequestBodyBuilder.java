package by.emall.yatsevich.api.utils;

import java.util.HashMap;
import java.util.Map;

public class RequestBodyBuilder {

    private final Map<String, Object> body = new HashMap<>();

    public RequestBodyBuilder setPhoneNumber(String phoneNumber) {
        String phoneField = "phone";
        String phoneNumberWithCountryCode = "+375" + phoneNumber;
        body.put(phoneField, phoneNumberWithCountryCode);
        return this;
    }

    public RequestBodyBuilder setPassword(String password) {
        String passwordField = "password";
        body.put(passwordField,password);
        return this;
    }

    public String build() {
        return JsonConverter.getJsonFromMap(body);
    }
}

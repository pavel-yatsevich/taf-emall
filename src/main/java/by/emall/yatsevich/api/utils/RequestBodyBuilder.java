package by.emall.yatsevich.api.utils;

public class RequestBodyBuilder {

    private final StringBuilder builder;

    public RequestBodyBuilder() {
        builder = new StringBuilder();
    }

    public RequestBodyBuilder setPhoneNumber(String phoneNumber) {
        String phoneWithCountryCode = "{\"phone\":\"+375";
        builder.append(phoneWithCountryCode)
                .append(phoneNumber);
        return this;
    }

    public RequestBodyBuilder setPassword(String password) {
        String andPassword = "\",\"password\":\"";
        builder.append(andPassword)
                .append(password);
        return this;
    }

    public String build() {
        String endOfBody = "\"}";
        return builder.append(endOfBody).toString();
    }
}

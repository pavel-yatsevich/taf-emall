package by.emall.yatsevich.api.page;

public class LoginFormByPassword extends BasePage {

    private static final String LOGIN_BY_PASSWORD_URI = "https://api-preprod.emall.by/api/v1/";

    @Override
    public String getPath() {
        return LOGIN_BY_PASSWORD_URI;
    }
}

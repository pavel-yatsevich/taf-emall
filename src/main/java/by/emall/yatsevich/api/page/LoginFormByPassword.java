package by.emall.yatsevich.api.page;

public class LoginFormByPassword extends BasePage {

    private static final String LOGIN_BY_PASSWORD_URI = "/auth/password";

    @Override
    public String getPath() {
        return LOGIN_BY_PASSWORD_URI;
    }
}

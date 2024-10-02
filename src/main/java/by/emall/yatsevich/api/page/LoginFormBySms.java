package by.emall.yatsevich.api.page;

public class LoginFormBySms extends BasePage {

    private static final String LOGIN_BY_SMS_URI = "/auth/sms";

    @Override
    public String getPath() {
        return LOGIN_BY_SMS_URI;
    }
}

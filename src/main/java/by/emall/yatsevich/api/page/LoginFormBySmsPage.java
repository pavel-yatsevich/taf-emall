package by.emall.yatsevich.api.page;

public class LoginFormBySmsPage extends BasePage {

    private static final String LOGIN_BY_SMS_URI = "https://api-preprod.emall.by/api/v1/auth/sms";

    @Override
    public String getPath() {
        return LOGIN_BY_SMS_URI;
    }
}

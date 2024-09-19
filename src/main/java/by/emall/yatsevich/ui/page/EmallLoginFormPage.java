package by.emall.yatsevich.ui.page;

import org.openqa.selenium.WebDriver;

public class EmallLoginFormPage extends AbstractPage {

    private static final String LOGIN_PAGE_URL = "https://emall.by/login";
    public static final String LOGIN_PAGE_BUTTON_ENTER_BY_PASSWORD_XPATH = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW btn_btn_type_secondary___G_V0 login_button__zjbHA login_enter_button__WJQjN']";
    public static final String LOGIN_PAGE_BUTTON_ENTER_BY_PASSWORD_XPATH1 = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW btn_btn_type_secondary___G_V0 login_button__zjbHA login_enter_button__WJQjN']";

    public EmallLoginFormPage() {
        super();
    }

    @Override
    public EmallLoginFormPage openPage() {
        driver.navigate().to(LOGIN_PAGE_URL);
        return this;
    }
}

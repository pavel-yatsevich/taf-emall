package by.emall.yatsevich.ui.page;

import org.openqa.selenium.WebDriver;

public class EmallMainPage extends AbstractPage {

    public static final String EMALL_MAIN_PAGE_LOGIN_FORM_BUTTON_XPATH = "//button[@class='touchable_button__GJNQZ actions_action__button__OiPrx']";
    private static final String BASE_URL = "https://emall.by/";

    public EmallMainPage() {
        super();
    }

    @Override
    public EmallMainPage openPage() {
        driver.navigate().to(BASE_URL);
        return this;
    }
}

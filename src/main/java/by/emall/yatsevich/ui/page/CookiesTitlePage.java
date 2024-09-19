package by.emall.yatsevich.ui.page;

import by.emall.yatsevich.ui.utils.Waiters;
import org.openqa.selenium.By;

public class CookiesTitlePage extends AbstractPage {

    private static final String BASE_URL = "https://emall.by/";
    private static final String BUTTON_ACCEPT_COOKIES_XPATH = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW cookies_button__qWM6Y']";

    private final By buttonAcceptCookiesBy = By.xpath(BUTTON_ACCEPT_COOKIES_XPATH);

    public EmallMainPage clickTheButtonAcceptCookies() {
        Waiters.getElementWithWaiter(driver, WAIT_TIME_DURATION_SEC, buttonAcceptCookiesBy).click();
        return new EmallMainPage();
    }

    @Override
    public EmallMainPage openPage() {
        driver.navigate().to(BASE_URL);
        return new EmallMainPage();
    }
}

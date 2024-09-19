package by.emall.yatsevich.ui.modal;

import by.emall.yatsevich.ui.page.EmallMainPage;
import org.openqa.selenium.By;

public class CookiesTitleModal extends AbstractModal {

    private static final String BUTTON_ACCEPT_COOKIES_XPATH = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW cookies_button__qWM6Y']";

    private final By buttonAcceptCookiesBy = By.xpath(BUTTON_ACCEPT_COOKIES_XPATH);

    public EmallMainPage clickTheButtonAcceptCookies() {

        return new EmallMainPage(driver);
    }
}

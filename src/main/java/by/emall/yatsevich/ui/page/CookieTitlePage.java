package by.emall.yatsevich.ui.page;

import by.emall.yatsevich.ui.utils.Waiters;
import org.openqa.selenium.By;

public class CookieTitlePage extends AbstractPage {

    private static final  String BASE_URL = "https://emall.by/";

    private final By buttonAcceptCookiesBy = By.xpath("//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW cookies_button__qWM6Y']");


    public EmallMainPage clickTheButtonAcceptCookies() {
        Waiters.getElementWithAvailabilityExpectation(driver, buttonAcceptCookiesBy).click();
        return new EmallMainPage();
    }

    @Override
    public EmallMainPage openPage() {
        driver.navigate().to(BASE_URL);
        return new EmallMainPage();
    }
}

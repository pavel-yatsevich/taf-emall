package by.emall.yatsevich.ui.page;

import by.emall.yatsevich.ui.page.constants.CookieTitleConstants;
import by.emall.yatsevich.ui.utils.Waiters;
import org.openqa.selenium.By;

public class CookieTitlePage extends AbstractPage implements CookieTitleConstants {

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

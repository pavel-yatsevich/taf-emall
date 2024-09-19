package by.emall.yatsevich.ui.page;

import by.emall.yatsevich.ui.page.constants.EmallLoginFormPageConstants;
import by.emall.yatsevich.ui.utils.Waiters;
import org.openqa.selenium.By;

public class EmallLoginFormPage extends AbstractPage implements EmallLoginFormPageConstants {

    private final By LOGIN_PAGE_BUTTON_ENTER_BY_PASSWORD_BY = By.xpath(LOGIN_PAGE_BUTTON_ENTER_BY_PASSWORD_XPATH);

    public EmallLoginFormByPasswordPage clickButtonEnterByPassword() {
        Waiters.getElementWithWaiter(driver, WAIT_TIME_DURATION_SEC, LOGIN_PAGE_BUTTON_ENTER_BY_PASSWORD_BY).click();
        return new EmallLoginFormByPasswordPage();
    }

    @Override
    public EmallLoginFormPage openPage() {
        driver.navigate().to(LOGIN_PAGE_URL);
        return this;
    }
}

package by.emall.yatsevich.ui.page;

import by.emall.yatsevich.ui.page.constants.EmallLoginFormByPasswordConstants;
import by.emall.yatsevich.ui.utils.Waiters;
import org.openqa.selenium.By;

public class EmallLoginFormByPasswordPage extends AbstractPage implements EmallLoginFormByPasswordConstants {

    private final By loginFormPhoneNumFieldBy = By.xpath(LOGIN_FORM_PHONE_NUM_FIELD_XPATH);
    private final By loginFormSeePasswordButtonBy = By.xpath(LOGIN_FORM_SEE_PASSWORD_BUTTON_XPATH);
    private final By loginFormPasswordFieldBy = By.xpath(LOGIN_FORM_PASSWORD_FIELD_XPATH);
    private final By loginFormEnterButtonBy = By.xpath(LOGIN_FORM_ENTER_BUTTON_XPATH);
    private final By loginFormErrorMessageBy = By.xpath(LOGIN_FORM_ERROR_MESSAGE_XPATH);

    public EmallLoginFormByPasswordPage enterPhoneNumber(Integer phoneNumber) {
        Waiters.getElementWithWaiter(driver, WAIT_TIME_DURATION_SEC, loginFormPhoneNumFieldBy)
                .sendKeys(phoneNumber.toString());
        return this;
    }

    public EmallLoginFormByPasswordPage clickButtonSeePassword() {
        Waiters.getElementWithWaiter(driver, WAIT_TIME_DURATION_SEC, loginFormSeePasswordButtonBy)
                .click();
        return this;
    }

    public EmallLoginFormByPasswordPage enterPassword(String password) {
        Waiters.getElementWithWaiter(driver, WAIT_TIME_DURATION_SEC, loginFormPasswordFieldBy)
                .sendKeys(password);
        return this;
    }

    public EmallLoginFormByPasswordPage clickLoginButton() {
        Waiters.getElementWithWaiter(driver, WAIT_TIME_DURATION_SEC, loginFormEnterButtonBy)
                .click();
        return this;
    }

    public String getTextFromErrorMessage() {
        return Waiters.getElementWithWaiter(driver, WAIT_TIME_DURATION_SEC, loginFormErrorMessageBy)
                .getText();
    }

    @Override
    public EmallLoginFormByPasswordPage openPage() {
        driver.navigate().to(LOGIN_FORM_PAGE_BY_PASSWORD_URL);
        return this;
    }
}

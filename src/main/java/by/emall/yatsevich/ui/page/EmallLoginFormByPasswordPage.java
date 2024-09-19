package by.emall.yatsevich.ui.page;

import by.emall.yatsevich.ui.utils.Waiters;
import org.openqa.selenium.By;

public class EmallLoginFormByPasswordPage extends AbstractPage {
    private static final String LOGIN_FORM_PAGE_BY_PASSWORD_URL = "https://emall.by/login/password";

    private final By loginFormPhoneNumFieldBy = By.xpath("//input[@class='new-input-phone_input__XWAH5']");
    private final By loginFormSeePasswordButtonBy = By.xpath("//div[@class='input_clickable__oKJEf']");
    private final By loginFormPasswordFieldBy = By.xpath("//input[@class='input_input___r0Z7 input_input_size_medium__00yqU']");
    private final By loginFormEnterButtonBy = By.xpath("//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW password_button__Pt0gU']");
    private final By loginFormErrorMessageBy = By.xpath("//div[@class='password_error_message__KRNDP']");

    public EmallLoginFormByPasswordPage enterPhoneNumber(Integer phoneNumber) {
        Waiters.getElementWithAvailabilityExpectation(driver, loginFormPhoneNumFieldBy)
                .sendKeys(phoneNumber.toString());
        return this;
    }

    public EmallLoginFormByPasswordPage clickButtonSeePassword() {
        Waiters.getElementWithAvailabilityExpectation(driver, loginFormSeePasswordButtonBy)
                .click();
        return this;
    }

    public EmallLoginFormByPasswordPage enterPassword(String password) {
        Waiters.getElementWithAvailabilityExpectation(driver, loginFormPasswordFieldBy)
                .sendKeys(password);
        return this;
    }

    public EmallLoginFormByPasswordPage clickLoginButton() {
        Waiters.getElementWithAvailabilityExpectation(driver, loginFormEnterButtonBy)
                .click();
        return this;
    }

    public String getTextFromErrorMessage() {
        return Waiters.getElementWithAvailabilityExpectation(driver, loginFormErrorMessageBy)
                .getText();
    }

    @Override
    public EmallLoginFormByPasswordPage openPage() {
        driver.navigate().to(LOGIN_FORM_PAGE_BY_PASSWORD_URL);
        return this;
    }
}

package by.emall.yatsevich.ui.page;

import by.emall.yatsevich.ui.utils.Waiters;
import org.openqa.selenium.By;

public class EmallLoginFormByPasswordPage extends AbstractPage {

    private static final String LOGIN_FORM_PAGE_BY_PASSWORD_URL = "https://emall.by/login/password";

    private static final String LOGIN_FORM_PHONE_NUM_FIELD_XPATH = "//input[@class='new-input-phone_input__XWAH5']";
    private static final String LOGIN_FORM_PASSWORD_FIELD_XPATH = "//input[@class='input_input___r0Z7 input_input_size_medium__00yqU']";
    private static final String LOGIN_FORM_SEE_PASSWORD_BUTTON_XPATH = "//div[@class='input_clickable__oKJEf']";
    private static final String LOGIN_FORM_ENTER_BUTTON_XPATH = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW password_button__Pt0gU']";
    private static final String LOGIN_FORM_ERROR_MESSAGE_XPATH = "//div[@class='password_error_message__KRNDP']";

    private static final String LOGIN_FORM_ERROR_MESSAGE_EMPTY_FIELDS_TEXT = "Значение поля \"Номер телефона\" должно начинаться с +375 затем код (25|29|33|44) и далее 7 цифр (первая из которых не 0)\n" +
            "Поле \"Пароль\" обязательно для заполнения.";
    private static final String LOGIN_FORM_ERROR_MESSAGE_EMPTY_PHONE_NUM_TEXT = "Значение поля \"Номер телефона\" должно начинаться с +375 затем код (25|29|33|44) и далее 7 цифр (первая из которых не 0)";
    private static final String LOGIN_FORM_ERROR_MESSAGE_EMPTY_PASSWORD_TEXT = "Поле \"Пароль\" обязательно для заполнения.";

    private final By LOGIN_FORM_PHONE_NUM_FIELD_BY = By.xpath(LOGIN_FORM_PHONE_NUM_FIELD_XPATH);
    private final By LOGIN_FORM_SEE_PASSWORD_BUTTON_BY = By.xpath(LOGIN_FORM_SEE_PASSWORD_BUTTON_XPATH);
    private final By LOGIN_FORM_PASSWORD_FIELD_BY = By.xpath(LOGIN_FORM_PASSWORD_FIELD_XPATH);
    private final By LOGIN_FORM_ENTER_BUTTON_BY = By.xpath(LOGIN_FORM_ENTER_BUTTON_XPATH);

    public EmallLoginFormByPasswordPage enterPhoneNumber(Integer phoneNumber) {
        Waiters.getElementWithWaiter(driver, WAIT_TIME_DURATION_SEC, LOGIN_FORM_PHONE_NUM_FIELD_BY)
                .sendKeys(phoneNumber.toString());
        return this;
    }

    public EmallLoginFormByPasswordPage clickButtonSeePassword() {
        Waiters.getElementWithWaiter(driver, WAIT_TIME_DURATION_SEC, LOGIN_FORM_SEE_PASSWORD_BUTTON_BY)
                .click();
        return this;
    }

    public EmallLoginFormByPasswordPage enterPassword(String password) {
        Waiters.getElementWithWaiter(driver, WAIT_TIME_DURATION_SEC, LOGIN_FORM_PASSWORD_FIELD_BY)
                .sendKeys(password);
        return this;
    }

    public EmallLoginFormByPasswordPage clickLoginButton() {
        Waiters.getElementWithWaiter(driver, WAIT_TIME_DURATION_SEC, LOGIN_FORM_ENTER_BUTTON_BY)
                .click();
        return this;
    }

    @Override
    public EmallLoginFormByPasswordPage openPage() {
        driver.navigate().to(LOGIN_FORM_PAGE_BY_PASSWORD_URL);
        return this;
    }
}

package by.emall.yatsevich.ui.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static by.emall.yatsevich.ui.utils.Waiters.waitWebElement;

public class EmallLoginFormByPasswordPage extends AbstractPage {

    private static final String LOGIN_FORM_PAGE_BY_PASSWORD_URL = "https://emall.by/login/password";

    @FindBy(xpath = "//input[@class='new-input-phone_input__XWAH5']")
    private WebElement loginFormPhoneNumFieldElement;
    @FindBy(xpath = "//div[@class='input_clickable__oKJEf']")
    private WebElement loginFormSeePasswordButtonElement;
    @FindBy(xpath = "//input[@class='input_input___r0Z7 input_input_size_medium__00yqU']")
    private WebElement loginFormPasswordFieldElement;
    @FindBy(xpath = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW password_button__Pt0gU']")
    private WebElement loginFormSubmitButtonElement;
    @FindBy(xpath = "//div[@class='password_error_message__KRNDP']")
    private WebElement loginFormErrorMessageElement;

    public EmallLoginFormByPasswordPage() {
        PageFactory.initElements(this.driver, this);
    }

    public EmallLoginFormByPasswordPage enterPhoneNumber(Integer phoneNumber) {
        loginFormPhoneNumFieldElement.sendKeys(phoneNumber.toString());
        return this;
    }

    public EmallLoginFormByPasswordPage clickButtonSeePassword() {
        loginFormSeePasswordButtonElement.click();
        return this;
    }

    public EmallLoginFormByPasswordPage enterPassword(String password) {
        loginFormPasswordFieldElement.sendKeys(password);
        return this;
    }

    public EmallLoginFormByPasswordPage clickLoginButton() {
        waitWebElement(driver).until(
                d -> {
                    loginFormSubmitButtonElement.click();
                    return true;
                });
        return this;
    }

    public String getErrorMessage() {
        waitWebElement(driver).until(d -> loginFormErrorMessageElement.isDisplayed());
        return loginFormErrorMessageElement.getText();
    }

    @Override
    public EmallLoginFormByPasswordPage openPage() {
        driver.navigate().to(LOGIN_FORM_PAGE_BY_PASSWORD_URL);
        return this;
    }
}

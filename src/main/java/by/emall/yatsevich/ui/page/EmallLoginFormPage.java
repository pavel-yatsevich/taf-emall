package by.emall.yatsevich.ui.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static by.emall.yatsevich.ui.utils.Waiters.*;

public class EmallLoginFormPage extends AbstractPage {

    private static final String LOGIN_PAGE_URL = "https://emall.by/login";

    @FindBy(xpath = "//input[@id='tel']")
    private WebElement loginFormPhoneNumFieldElement;
    @FindBy(xpath = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW btn_btn_type_secondary___G_V0 login_button__zjbHA login_enter_button__WJQjN']")
    private WebElement loginFormButtonEnterByPasswordElement;
    @FindBy(xpath = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW login_button__zjbHA']")
    private WebElement loginFormButtonGetCodeElement;
    @FindBy(xpath = "//div[@class='new-input-phone_message__H_yAc']")
    private WebElement loginFormErrorMessageElement;

    public EmallLoginFormPage() {
        PageFactory.initElements(this.driver, this);
    }

    public EmallLoginFormPage clickButtonGetCode() {
        waitWebElement(driver).until(
                d -> {
                    loginFormButtonGetCodeElement.click();
                    return true;
                });
        return this;
    }

    public EmallLoginFormPage enterPhoneNumber(String phoneNumber) {
        waitWebElement(driver).until(
                d -> {
                    loginFormPhoneNumFieldElement.sendKeys(phoneNumber);
                    return true;
                });
        return this;
    }

    public String getErrorMessage() {
        waitWebElement(driver).until(d -> loginFormErrorMessageElement.isDisplayed());
        return loginFormErrorMessageElement.getText();
    }

    public EmallLoginFormByPasswordPage clickButtonEnterByPassword() {
        waitWebElement(driver).until(
                d -> {
                    loginFormButtonEnterByPasswordElement.click();
                    return true;
                });
        return new EmallLoginFormByPasswordPage();
    }

    @Override
    public EmallLoginFormPage openPage() {
        driver.navigate().to(LOGIN_PAGE_URL);
        return this;
    }
}

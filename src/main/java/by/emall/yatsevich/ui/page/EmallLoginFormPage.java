package by.emall.yatsevich.ui.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmallLoginFormPage extends AbstractPage {
    private static final String LOGIN_PAGE_URL = "https://emall.by/login";

    @FindBy(xpath = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW btn_btn_type_secondary___G_V0 login_button__zjbHA login_enter_button__WJQjN']")
    private WebElement buttonEnterByPasswordElement;

    public EmallLoginFormPage() {
        PageFactory.initElements(this.driver, this);
    }

    public EmallLoginFormByPasswordPage clickButtonEnterByPassword() {
        buttonEnterByPasswordElement.click();
        return new EmallLoginFormByPasswordPage();
    }

    @Override
    public EmallLoginFormPage openPage() {
        driver.navigate().to(LOGIN_PAGE_URL);
        return this;
    }
}

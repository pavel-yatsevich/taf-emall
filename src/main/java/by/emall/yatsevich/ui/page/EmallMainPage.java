package by.emall.yatsevich.ui.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmallMainPage extends AbstractPage {

    private static final String BASE_URL = "https://emall.by/";

    @FindBy(xpath = "//button[@class='touchable_button__GJNQZ actions_action__button__OiPrx']")
    private WebElement loginFormButtonElement;

    public EmallMainPage() {
        PageFactory.initElements(this.driver,this);
    }

    public EmallLoginFormPage clickToLoginFormButton() {
        loginFormButtonElement.click();
        return new EmallLoginFormPage();
    }

    @Override
    public CookieTitlePage openPage() {
        driver.navigate().to(BASE_URL);
        return new CookieTitlePage();
    }
}

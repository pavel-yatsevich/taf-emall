package by.emall.yatsevich.ui.page;

import by.emall.yatsevich.ui.driver.ChromeDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookieTitlePage extends AbstractPage {

    private static final String BASE_URL = "https://emall.by/";

    @FindBy(xpath = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW cookies_button__qWM6Y']")
    private WebElement buttonAcceptCookiesElement;

    public CookieTitlePage() {
        PageFactory.initElements(this.driver, this);
    }

    public EmallMainPage clickAcceptCookiesButton() {
        ChromeDriverSingleton.clickToWebElementWithWaiter(buttonAcceptCookiesElement);
        return new EmallMainPage();
    }

    @Override
    public EmallMainPage openPage() {
        driver.navigate().to(BASE_URL);
        return new EmallMainPage();
    }
}

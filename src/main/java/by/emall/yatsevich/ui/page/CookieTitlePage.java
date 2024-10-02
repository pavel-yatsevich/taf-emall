package by.emall.yatsevich.ui.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static by.emall.yatsevich.ui.driver.ChromeDriverSingleton.clickToWebElementWithWaiter;

public class CookieTitlePage extends AbstractPage {

    @FindBy(xpath = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW cookies_button__qWM6Y']")
    private WebElement buttonAcceptCookiesElement;

    public CookieTitlePage() {
        PageFactory.initElements(driver, this);
    }

    public EmallMainPage clickAcceptCookiesButton() {
        clickToWebElementWithWaiter(buttonAcceptCookiesElement);
        return new EmallMainPage();
    }

    @Override
    public EmallMainPage openPage() {
        driver.navigate().to(BASE_URL);
        return new EmallMainPage();
    }
}

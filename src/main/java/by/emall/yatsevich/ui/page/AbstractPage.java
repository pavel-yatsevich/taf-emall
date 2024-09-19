package by.emall.yatsevich.ui.page;

import by.emall.yatsevich.ui.driver.ChromeDriverSingleton;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver driver;

    public abstract AbstractPage openPage();

    public AbstractPage(){
        this.driver = ChromeDriverSingleton.getDriver();
    }
}

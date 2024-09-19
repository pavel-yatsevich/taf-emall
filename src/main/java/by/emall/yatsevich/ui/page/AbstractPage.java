package by.emall.yatsevich.ui.page;

import by.emall.yatsevich.ui.driver.ChromeDriverSingleton;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected int WAIT_TIME_DURATION_SEC = 2;

    public AbstractPage(){
        this.driver = ChromeDriverSingleton.getDriver();
    }

    public abstract AbstractPage openPage();
}

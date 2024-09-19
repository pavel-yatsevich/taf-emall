package by.emall.yatsevich.ui.page;

import by.emall.yatsevich.ui.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(){
        this.driver = DriverSingleton.getDriver();
    }

    public abstract AbstractPage openPage();
}

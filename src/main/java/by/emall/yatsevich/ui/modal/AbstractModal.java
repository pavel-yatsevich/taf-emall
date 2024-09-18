package by.emall.yatsevich.ui.modal;

import by.emall.yatsevich.ui.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public abstract class AbstractModal {
    protected WebDriver driver;

    public AbstractModal() {
        this.driver = DriverSingleton.getDriver();
    }
}

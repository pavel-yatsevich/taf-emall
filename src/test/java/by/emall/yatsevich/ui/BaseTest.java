package by.emall.yatsevich.ui;

import by.emall.yatsevich.ui.driver.ChromeDriverSingleton;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {

    protected String actualErrorMessage;

    @AfterEach
    public void shutUp() {
        ChromeDriverSingleton.closeDriver();
    }
}

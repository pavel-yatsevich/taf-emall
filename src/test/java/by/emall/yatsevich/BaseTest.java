package by.emall.yatsevich;

import by.emall.yatsevich.ui.driver.ChromeDriverSingleton;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {

    @AfterEach
    public void shutUp() {
        ChromeDriverSingleton.closeDriver();
    }
}

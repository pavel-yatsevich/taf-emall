package by.emall.yatsevich.ui.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiters {

    private static final int WAIT_TIMEOUT_SECONDS = 10;
    private static final int POLLING_INTERVAL_MILLIS = 300;

    public static Wait<WebDriver> waitWebElement(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .pollingEvery(Duration.ofMillis(POLLING_INTERVAL_MILLIS));
    }
}

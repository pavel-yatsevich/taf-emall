package by.emall.yatsevich.components.utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiters {

    private static final int WAIT_TIMEOUT_SECONDS = 30;

    public static Wait<WebDriver> waitWebElement(WebDriver driver) {
        return new WebDriverWait(driver,Duration.ofSeconds(WAIT_TIMEOUT_SECONDS));
    }

    public static void getGlobalWait() {
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package by.emall.yatsevich.ui.utils;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Waiters {

    private static final int WAIT_TIMEOUT_SECONDS = 15;

    public static Wait<WebDriver> waitWebElement(WebDriver driver) {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }
}


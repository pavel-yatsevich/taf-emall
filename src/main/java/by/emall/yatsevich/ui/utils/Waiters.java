package by.emall.yatsevich.ui.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiters {

    private static final int WAIT_TIMEOUT_SECONDS = 10;

    public static WebElement getElementWithAvailabilityExpectation(WebDriver driver, By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public static WebElement getElementToBeClickable(WebDriver driver, By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions.elementToBeClickable(by));
    }
}

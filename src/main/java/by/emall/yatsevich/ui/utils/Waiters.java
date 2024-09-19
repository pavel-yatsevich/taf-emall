package by.emall.yatsevich.ui.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiters {

    public static WebElement getElementWithWaiter(WebDriver driver, int waitTimeSec, By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(waitTimeSec)).until(ExpectedConditions.presenceOfElementLocated(by));
    }
}

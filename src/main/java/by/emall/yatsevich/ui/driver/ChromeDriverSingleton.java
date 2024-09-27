package by.emall.yatsevich.ui.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static by.emall.yatsevich.ui.utils.Waiters.*;

public class ChromeDriverSingleton {

    private static WebDriver driver;

    private ChromeDriverSingleton() {
    }

    public static WebDriver getDriver() {
        if (null == driver) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }

    public static void sendKeysToElementWithWaiter(WebElement webElement, String keys) {
        waitWebElementToBeSent(driver).until(
                d -> {
                    webElement.sendKeys(keys);
                    return true;
                });
    }

    public static void clickToWebElementWithWaiter(WebElement element) {
        waitWebElementToBeClick(driver).until(
                d -> {
                    element.click();
                    return true;
                });
    }

    public static String getTextFromWebElementWithWaiter(WebElement webElement) {
        waitWebElementToBeDisplay(driver).until(d-> webElement.isDisplayed());
        return webElement.getText();
    }
}

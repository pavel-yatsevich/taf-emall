package by.emall.yatsevich.ui.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static by.emall.yatsevich.components.utils.Waiters.waitWebElement;

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
        waitWebElement(driver).until(
                d -> {
                    webElement.sendKeys(keys);
                    return true;
                });
    }

    public static void clickToWebElementWithWaiter(WebElement element) {
        waitWebElement(driver).until(
                d -> {
                    element.click();
                    return true;
                });
    }

    public static String getTextFromWebElementWithWaiter(WebElement webElement) {
        waitWebElement(driver).until(d-> webElement.isDisplayed());
        return webElement.getText();
    }
}

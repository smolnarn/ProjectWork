package pages;

import browser.BrowserType;
import browser.DriverInitializer;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.fail;

public class BasePage implements IBasePage {
    protected static WebDriver driver;

    protected static WebDriverWait wait;

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public static void openPage(String url) {
        driver.get(url);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#content")));
    }

    @Override
    public boolean isLoaded(WebElement element) {
        try {
            return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        } catch (TimeoutException e) {
            fail(e);
            return false;
        }
    }

    @Override
    public boolean isInteractable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled();
    }

    public static void initAll() {
        driver = DriverInitializer.initDriver(BrowserType.CHROME_SELENIUM_MGR);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    public static void cleanupAll() {
        driver.quit();
    }

}
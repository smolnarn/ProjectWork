package TescoSteps;

import browser.BrowserType;
import browser.DriverInitializer;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static browser.Settings.BASE_URL;

public class BaseTest {

    WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void openBrowser() {
        driver = DriverInitializer.initDriver(BrowserType.CHROME_SELENIUM_MGR);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    @io.cucumber.java.en.Given("^I open the home page$")
    public void iOpenTheHomePage() {
        driver.get(BASE_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#content")));

    }

    @io.cucumber.java.en.When("^I accept cookies$")
    public void iAcceptCookies() {

    }

    @After
    public void after() {
        driver.quit();
    }
}


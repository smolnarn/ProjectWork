package steps;

import browser.BrowserType;
import browser.DriverInitializer;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

public class hooks {
    @BeforeAll
    public static void openBrowser() {
        BasePage.initAll();
    }


    @AfterAll
    public static void cleanup() {
        BasePage.cleanupAll();
    }
}

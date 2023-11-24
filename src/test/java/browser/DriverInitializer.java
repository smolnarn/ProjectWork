package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInitializer {

    public static WebDriver initDriver(BrowserType browserType) {
        ChromeOptions options = new ChromeOptions();
        switch (browserType) {
            case CHROME_SELENIUM_MGR:
                options.addArguments("--disable-blink-features=AutomationControlled");
                options.addArguments("--incognito");
                return new ChromeDriver(options);
            case CHROME_PORTABLE:
                System.setProperty("webdriver.chrome.driver", Settings.CHROMEDRIVER_PORTABLE_PATH);
                options.setBinary(Settings.CHROME_PORTABLE_PATH);
                options.addArguments("--disable-blink-features=AutomationControlled");
                options.addArguments("--incognito");
                return new ChromeDriver(options);
            default:
                throw new IllegalArgumentException("Incorrect browser type!");
        }
    }
}

/*
    ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
                driver = new ChromeDriver(chromeOptions);
 */
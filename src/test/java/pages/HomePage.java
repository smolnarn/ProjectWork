package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(css = "#sticky-bar-cookie-wrapper form:nth-of-type(1) button")
    WebElement acceptCookiesButton;

    // search text field home page
    @FindBy(xpath = "//*[@id=\"search-input\"]")
    WebElement searchField;

    @FindBy(xpath = "//*[@id=\"search-form\"]/button")
    WebElement searchButton;

    @FindBy(css = "#sticky-bar-cookie-wrapper div")
    WebElement cookieOverlay;

    public void acceptCookies() {
        acceptCookiesButton.click();
    }

    public boolean isCookiesVisible() {
        return isLoaded(cookieOverlay);
    }

    /*public SearchResultPage search(String productName) {
        searchField.sendKeys(productName);
        searchButton.click();
        SearchResultPage searchResult = new SearchResultPage(driver);
        searchResult.isLoaded();
        return searchResult;
    }*/

    public boolean isLoaded() {
        return isLoaded(acceptCookiesButton)
                && isLoaded(searchField) && isLoaded(searchButton);
    }

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = ".results-page .pagination__items-displayed strong:nth-of-type(2)")
    WebElement searchResultCount;


    public void validateSearchResultNumber(int numOfProducts) {
        assertTrue(isLoaded());
        assertTrue(searchResultCount.getText().contains("" + numOfProducts));
    }

    public boolean isLoaded() {
        boolean isLoaded = isLoaded(searchResultCount);
        return isLoaded;
    }
}
package pages;

import org.openqa.selenium.WebElement;

public interface IBasePage {
    boolean isLoaded(WebElement element);

    boolean isInteractable(WebElement element);
}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import pages.HomePage;

import static browser.Settings.BASE_URL;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class cookies extends BaseTest {

    private HomePage homePage;

    @Given("^I open the home page$")
    public void iOpenTheHomePage() {
        BasePage.openPage(BASE_URL);
        homePage = new HomePage();

    }

    @When("^I accept cookies$")
    public void iAcceptCookies() {
        homePage.acceptCookies();

    }

    @Then("^the cookies are disappeared$")
    public void theCookiesAreDisappeared() {

        boolean cookies = homePage.isCookiesVisible();
        assertFalse(cookies);
    }
}

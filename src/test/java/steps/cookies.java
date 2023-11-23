package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.HomePage;

import static browser.Settings.BASE_URL;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class cookies {

    private HomePage homePage;

    @Given("I open the home page")
    public void iOpenTheHomePage() {
        BasePage.openPage(BASE_URL);
        homePage = new HomePage();

    }

    @When("I accept cookies")
    public void iAcceptCookies() throws InterruptedException {
        homePage.acceptCookies();
        Thread.sleep(5000);
    }

    @Then("the cookies are disappeared")
    public void theCookiesAreDisappeared() {

        boolean cookies = homePage.isCookiesVisible();
        assertFalse(cookies);
    }

    @And("Home page still visible")
    public void homePageStillVisible() {
        assertTrue(homePage.isVisible());

    }
}

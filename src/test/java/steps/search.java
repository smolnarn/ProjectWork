package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultPage;

public class search {
    @When("I search for the {string}")
    public void iSearchForThe(String productName) {
        HomePage homePage = new HomePage();
        homePage.search(productName);
        SearchResultPage searchPage = new SearchResultPage();
        searchPage.isLoaded();
    }


    @And("{string}  products are displayed and the product's name contains {string}")
    public void productsAreDisplayedAndTheProductSNameContains(String arg0, String arg1) {
    }

    @And("header contains the word {string}")
    public void headerContainsTheWord(String arg0) {
    }

    @And("a product's name contains the {string}")
    public void aProductSNameContainsThe(String arg0) {
    }

    @Then("Search results loaded")
    public void searchResultsLoaded() {
    }
}

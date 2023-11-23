package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class addProduct {
    @When("I search for {string}")
    public void iSearchFor(String arg0) {
    }

    @And("{int} products are displayed and the product's name contains {string}")
    public void productsAreDisplayedAndTheProductSNameContains(int arg0, String arg1) {
    }

    @And("I add a product to the cart")
    public void iAddAProductToTheCart() {
    }
}

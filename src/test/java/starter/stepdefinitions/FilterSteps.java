package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import starter.Pages.HomePage;

public class FilterSteps {

    HomePage homePage;

    @When("User Sorting product by {string}")
    public void userSortingProductBy(String label) {
        homePage.filterProduct(label);
    }

    @Then("Product is sorted {string} and {string}")
    public void productIsSorted(String textPrice, String textName) {
        Assert.assertEquals(textPrice, homePage.getProdPrice());
        Assert.assertEquals(textName, homePage.getProdName());
    }
}

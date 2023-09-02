package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.HomePage;
import starter.Pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;

public class CartSteps {

    LoginPage loginPage;
    CartPage cartPage;
    HomePage homePage;

    @Given("Already login on website sauce demo")
    public void verifyLogin(){
        cartPage.open();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.btnLogin();
    }
    @And("Already on homepage")
    public void verifyHomePage() {
       assertTrue(homePage.verifyHomePage());
    }

    @When("Click add to cart button")
    public void cartButton(){
        cartPage.addProduct();
    }

    @And("Click cart icon")
    public void cartIcon(){
        cartPage.cart();
    }

    @Then("The added product should be displayed")
    public void verifyProductItem(){
        assertTrue(cartPage.verifyProductList());
    }

    @And("Click remove on product item")
    public void clickRemoveOnProductItem() {
        cartPage.removeProduct();
    }

    @Then("Product item should be removed")
    public void productItemShouldBeRemoved() {
        assertFalse(cartPage.verifyRemoveProd());
    }

    @When("Click continue shopping button")
    public void clickContinueShoppingButton() {
        cartPage.continueShopBtn();
    }
}

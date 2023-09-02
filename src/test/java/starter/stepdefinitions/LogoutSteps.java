package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.HomePage;
import starter.Pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;


public class LogoutSteps {

    LoginPage loginPage;
    HomePage homePage;

    @When("Click side navbar icon")
    public void clickSideNavbarIcon() throws InterruptedException {
        homePage.clickNavbarIcon();
        Thread.sleep(500);
    }

    @And("Click Logout")
    public void clickLogout() {
        homePage.clickLogout();
    }

    @Then("Should be on Login Page")
    public void shouldBeOnLoginPage() {
        assertTrue(loginPage.verifyLoginPage());
    }

}

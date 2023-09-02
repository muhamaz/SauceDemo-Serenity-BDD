package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.HomePage;
import starter.Pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;


public class LoginSteps {
    LoginPage loginPage;
    HomePage homePage;

    @Given("Already on login page")
    public void verifyLoginPage(){
        loginPage.open();
        assertTrue(loginPage.verifyLoginPage());
    }

    @When("User input {string} as userName and input {string} as password")
    public void inputCredential(String userName, String password){
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
    }


    @And("Click login button")
    public void clickLoginButton() {
        loginPage.btnLogin();
    }

    @Then("Redirect to homepage")
    public void redirectToHomepage() {
        assertTrue(homePage.verifyHomePage());
    }

    @Then("Error message {string} should appear")
    public void errorMessageShouldAppear(String message){
        assertEquals(message, loginPage.errorText());
    }
}

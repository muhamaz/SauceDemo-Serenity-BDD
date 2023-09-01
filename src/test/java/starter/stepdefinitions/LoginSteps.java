package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.LoginPages;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {
    LoginPages loginPages;

    //Scenario 1
    @Given("User already on login page")
    public void UserAlreadyOnLoginPage() {
        loginPages.open();
    }

    @When("User input username {string}")
    public void UserInputUsername(String username) {
        loginPages.InputUsername(username);
    }

    @And("User input password {string}")
    public void UserInputPassword(String password) {
        loginPages.InputPassword(password);
    }

    @And("User click login button")
    public void UserClickLoginButton() {
        loginPages.clickButton();
    }

    @Then("User directed to inventory page")
    public void UserDicrectedToInventoryPage() {
        assertEquals("https://www.saucedemo.com/inventory.html", loginPages.getUrl());
    }

    @Given("User already on login")
    public void UserAlreadyLogIn () {
        loginPages.open();
        loginPages.InputUsername("standard_user");
        loginPages.InputPassword("secret_sauce");
        loginPages.clickButton();
    }

    //Scenario 2
    @Given("User landing on login page")
    public void UserLandingOnLoginPage() {
        loginPages.open();
    }
    @When("User input invalid username {string}")
    public void UserInputInvalidUsername(String username) {
        loginPages.InputUsername(username);
    }
    @And("User input valid password {string}")
    public void UserInputValidPassword(String password) {
        loginPages.InputPassword(password); }

    @And("User click on login button")
    public void UserClickOnLoginButton() {
        loginPages.clickButton(); }

    @Then("User can not login")
    public void UserCanNotLogin() {
        assertEquals("https://www.saucedemo.com/",loginPages.getUrl());
    }
}

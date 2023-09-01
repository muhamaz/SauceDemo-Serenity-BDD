package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")

public class LoginPages extends PageObject {
    @Managed
    WebDriver driver = getDriver();
    private final By fieldUsername = By.xpath("//input[@id='user-name']");
    private final By fieldPassword = By.xpath("//input[@id='password']");
    private final By loginButton = By.xpath("//input[@id='login-button']");

    public void InputUsername (String username) {
        driver.findElement(fieldUsername).sendKeys(username);}

    public void InputPassword (String password) {
        driver.findElement(fieldPassword).sendKeys(password);}

    public void clickButton () {
        driver.findElement(loginButton).click();
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }

}
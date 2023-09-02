package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

   private final By userName = By.xpath("//input[@id='user-name']");
    public void setUserName(String userName){
        driver.findElement(this.userName).sendKeys(userName);
    }

    private final By password = By.xpath("//input[@id='password']");
    public void setPassword(String password){
        driver.findElement(this.password).sendKeys(password);
    }

    private final By loginBtn = By.xpath("//input[@id='login-button']");
    public void btnLogin(){
        driver.findElement(loginBtn).click();
    }
    public boolean verifyLoginPage(){
        return driver.findElement(loginBtn).isDisplayed();
    }

    private final By errorText = By.cssSelector("h3");
    public String errorText(){
        return driver.findElement(errorText).getText();
    }
}

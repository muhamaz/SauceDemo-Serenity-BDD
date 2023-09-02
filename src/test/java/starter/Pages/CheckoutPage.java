package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class CheckoutPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    public void addProduct(String prodName){
        driver.findElement(By.xpath("//button[contains(@id,'"+prodName+"')]")).click();
    }


    /**
     * Removing one product on cart page
     */
    private final By removeProdOne = By.xpath("//button[@id='remove-sauce-labs-onesie']");
    public void removeOne(){
        driver.findElement(removeProdOne).click();
    }


    /**
     * Checkout button on cart page
     */
    private final By checkoutBtn = By.xpath("//button[@id='checkout']");
    public void clickCheckout(){
        driver.findElement(checkoutBtn).click();
    }

    /**
     * Verify Checkout button on cart page
     */
    public boolean verifyCheckoutBtn(){
        return driver.findElement(checkoutBtn).isDisplayed();
    }


    /**
     * Checkout page Form Field
     */
    private final By checkoutPage = By.xpath("//div[@id='checkout_info_container']");
    public boolean verifyCheckoutPage(){
        return driver.findElement(checkoutPage).isDisplayed();
    }

    private final By firstName = By.xpath("//input[@id='first-name']");
    public void setFirstName(String firstName){
        driver.findElement(this.firstName).sendKeys(firstName);
    }

private final By lastName = By.xpath("//input[@id='last-name']");
    public void setLastName(String lastName){
        driver.findElement(this.lastName).sendKeys(lastName);
    }

   private final By postalCode = By.xpath("//input[@id='postal-code']");
    public void setPostalCode(int postalCode){
        driver.findElement(this.postalCode).sendKeys(String.valueOf(postalCode));
    }

  private final By continueBtn = By.xpath("//input[@id='continue']");
    public void clickContinue(){
        driver.findElement(continueBtn).click();
    }

    private final By cancelBtn = By.xpath("//button[@id='cancel']");
    public void clickCancelBtn(){
        driver.findElement(cancelBtn).click();
    }

    /**
     * End of Checkout Form Field
     */


    /**
     * Checkout Summary page
     */
 private final By checkoutSum = By.xpath("//div[@id='checkout_summary_container']");
    public boolean verifyCheckoutSum(){
        return driver.findElement(checkoutSum).isDisplayed();
    }

   private final By totalPrice = By.xpath("//div[@class='summary_info_label summary_total_label']");
    public String getTotalPrice(){
        return driver.findElement(totalPrice).getText();
    }

  private final By finishBtn = By.xpath("//button[@id='finish']");
    public void clickFinishBtn(){
        driver.findElement(finishBtn).click();
    }

    /**
     * End of Checkout Summary
     */


    /**
     * Checkout Complete page
     */
    private final By backHomeBtn = By.xpath("//button[@id='back-to-products']");
    public void clickBackBtn(){
        driver.findElement(backHomeBtn).click();
    }


}

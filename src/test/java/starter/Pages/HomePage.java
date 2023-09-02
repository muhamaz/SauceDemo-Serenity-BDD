package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://www.saucedemo.com/")
public class HomePage extends PageObject {

    @Managed
    WebDriver driver = getDriver();


    /**
     * Verify on HomePage
     */
   private final By productList = By.xpath("//div[@class='inventory_container']");
    public boolean verifyHomePage(){
        return driver.findElement(productList).isDisplayed();
    }


    /**
     * Filter Func on HomePage
     */
   private final By filter = By.xpath("//select[@class='product_sort_container']");
    public void filterProduct(String text){
        Select selectProduct = new Select(driver.findElement(filter));
        selectProduct.selectByVisibleText(text);
    }

    /**
     * Filter Verification by price and product name
     */
    private final By price = By.cssSelector(".inventory_list > div:nth-of-type(1) .inventory_item_price");
    public String getProdPrice(){
        return driver.findElement(price).getText();
    }
    private final By prodName = By.cssSelector(".inventory_list > div:nth-of-type(1) .inventory_item_name");
    public String getProdName(){
        return driver.findElement(prodName).getText();
    }

    /**
     * Navbar
     */
   private final By navbarIcon = By.xpath("//button[@id='react-burger-menu-btn']");
    public void clickNavbarIcon(){
        driver.findElement(navbarIcon).click();
    }

   private final By logout = By.cssSelector("#logout_sidebar_link");
    public void clickLogout(){
        driver.findElement(logout).click();
    }
}

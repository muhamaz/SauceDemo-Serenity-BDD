package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



@DefaultUrl("https://www.saucedemo.com/")
public class CartPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    /**
     * Verify Cart Page
     */
    private final By verifyCart = By.xpath("//div[@class='cart_list']");
    public boolean verifyCartPage(){
        return driver.findElement(verifyCart).isDisplayed();
    }


    /**
     * Add to Cart Button
     */
   private final By addToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    public void addProduct(){
        driver.findElement(addToCart).click();
    }


    /**
     * Cart Icon
     */
    private final By cartIcon = By.xpath("//div[@id='shopping_cart_container']/a[1]");
    public void cart(){
        driver.findElement(cartIcon).click();
    }


    /**
     * Add and Remove product item on Cart Page
     */
   private final By productAdded = By.xpath("//div[@class='cart_item']");
    public boolean verifyProductList(){
        return driver.findElement(productAdded).isDisplayed();
    }

    /**
     * Add and Remove product item on Cart Page
     */
   private final By removeProduct = By.xpath("//button[@id='remove-sauce-labs-backpack']");
    public void removeProduct(){
        driver.findElement(removeProduct).click();
    }

    /**
     * Verify Remove Product
     */
  private final By verifyRemove = By.className("removed_cart_item");
    public boolean verifyRemoveProd(){
        return driver.findElement(verifyRemove).isDisplayed();
    }


    /**
     * Continue Shopping Button
     */
    private final By contShopBtn = By.xpath("//button[@id='continue-shopping']");
    public void continueShopBtn(){
        driver.findElement(contShopBtn).click();
    }

}

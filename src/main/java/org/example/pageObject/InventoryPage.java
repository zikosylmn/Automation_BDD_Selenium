package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    public static WebDriver webDriver;

    public InventoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//span[@class='title']")
    private WebElement labelProduct;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectProduct;
    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement clickCart;


    public boolean verifyLabelProduct(){
        return labelProduct.isDisplayed();
    }
    public void sortProduct(String filterProduct){
        Select sort = new Select(selectProduct);
        sort.selectByVisibleText(filterProduct);
    }
    public void clickAddToCartProduct(String product){
        String xpath = "//div[contains(text(),'"+ product+ "')]/ancestor::div[@class='inventory_item']//button[text()='Add to cart']";
        webDriver.findElement(By.xpath(xpath)).click();
    }
    public void clickCartProduct(){
        clickCart.click();
    }
}

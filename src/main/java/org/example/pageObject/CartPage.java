package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver webDriver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    private WebElement removeProduct;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    public void clickRemoveProduct(){
        removeProduct.click();
    }
    public void clickCheckoutButton(){
        checkoutButton.click();
    }
}

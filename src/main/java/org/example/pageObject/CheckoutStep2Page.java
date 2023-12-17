package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStep2Page {
    public static WebDriver webDriver;

    public CheckoutStep2Page(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//div[.='SauceCard #31337']")
    private WebElement labelPaymentInfo;
    @FindBy(xpath = "//div[.='Free Pony Express Delivery!']")
    private WebElement labelShippingInfo;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement labelSubTotalPrice;
    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement labelTaxTotal;
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement labelTotalPrice;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    public boolean verifyLabelPaymentInfo(){
        return labelPaymentInfo.isDisplayed();
    }
    public boolean verifyLabelShippingInfo(){
        return labelShippingInfo.isDisplayed();
    }
    public String verifyLabelSubTotalPrice(){
        return labelSubTotalPrice.getText();
    }
    public String verifyLabelTaxTotal(){
        return labelTaxTotal.getText();
    }
    public String verifyLabelTotalPrice(){
        return labelTotalPrice.getText();
    }
    public void clickFinishButton(){
        finishButton.click();
    }
}

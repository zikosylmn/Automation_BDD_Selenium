package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
    public static WebDriver webDriver;

    public CheckoutCompletePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//img[@alt='Pony Express']")
    private WebElement iconChecklist;
    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement labelThankYou;
    @FindBy(xpath = "//div[@class='complete-text']")
    private WebElement labelCompleteText;

    public boolean verifyIconChecklist(){
        return iconChecklist.isDisplayed();
    }
    public boolean verifyThankYou(){
        return labelThankYou.isDisplayed();
    }
    public boolean verifyLabelCompleteText(){
        return labelCompleteText.isDisplayed();
    }
}

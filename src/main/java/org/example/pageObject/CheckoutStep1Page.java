package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStep1Page {
    public static WebDriver webDriver;

    public CheckoutStep1Page(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement fieldFirstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement fieldLastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement fieldPostalCode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    public void inputFieldFirstName(String firstName){
        fieldFirstName.sendKeys(firstName);
    }
    public void inputFieldLastName(String lastName){
        fieldLastName.sendKeys(lastName);
    }
    public void inputFieldPostalCode(String postalCode){
        fieldPostalCode.sendKeys(postalCode);
    }
    public void clickContinueButton(){
        continueButton.click();
    }
}

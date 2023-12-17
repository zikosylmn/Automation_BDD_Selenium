package step_definitions;

import io.cucumber.java.en.And;
import org.example.pageObject.CheckoutStep1Page;
import org.openqa.selenium.WebDriver;

public class CheckoutStep1Steps {
    private final WebDriver driver = Hooks.driver;
    CheckoutStep1Page checkoutStep1Page = new CheckoutStep1Page(driver);

    @And("User input {string} as a firstname {string} as a lastname {string} as a postalCode")
    public void inputCredentialInformation(String firstName,String lastName,String postalCode) {
        checkoutStep1Page.inputFieldFirstName(firstName);
        checkoutStep1Page.inputFieldLastName(lastName);
        checkoutStep1Page.inputFieldPostalCode(postalCode);
        checkoutStep1Page.clickContinueButton();
    }
}

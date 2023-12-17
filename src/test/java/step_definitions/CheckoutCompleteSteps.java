package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CheckoutCompletePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompleteSteps {
    private final WebDriver driver = Hooks.driver;
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);

    @Then("User already completing the order")
    public void CredentialCompleteOrder() {
        Assert.assertTrue(checkoutCompletePage.verifyIconChecklist());
        Assert.assertTrue(checkoutCompletePage.verifyThankYou());
        Assert.assertTrue(checkoutCompletePage.verifyLabelCompleteText());
    }
}

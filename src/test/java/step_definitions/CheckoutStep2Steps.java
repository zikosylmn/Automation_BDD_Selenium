package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutStep2Page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutStep2Steps {
    private final WebDriver driver = Hooks.driver;
    CheckoutStep2Page checkoutStep2Page = new CheckoutStep2Page(driver);

    @Then("User verify payment information and shipping information")
    public void labelCredentialPayment() {
        Assert.assertTrue(checkoutStep2Page.verifyLabelPaymentInfo());
        Assert.assertTrue(checkoutStep2Page.verifyLabelShippingInfo());
    }
    @And("User verify item total price {string} product added")
    public void labelSubTotalPrice(String subTotalPrice){
        Assert.assertEquals(subTotalPrice, checkoutStep2Page.verifyLabelSubTotalPrice());
    }
    @And("User verify tax {string} from item total price")
    public void labelTaxTotal(String taxTotal){
        Assert.assertEquals(taxTotal, checkoutStep2Page.verifyLabelTaxTotal());
    }
    @And("User verify total price {string} from item total and tax")
    public void verifyLabelTotalPrice(String priceTotal){
        Assert.assertEquals(priceTotal, checkoutStep2Page.verifyLabelTotalPrice());
    }
    @When("User click finish button")
    public void clickFinishButton(){
        checkoutStep2Page.clickFinishButton();
    }
}

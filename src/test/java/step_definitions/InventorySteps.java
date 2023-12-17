package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.InventoryPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class InventorySteps {
    private final WebDriver driver = Hooks.driver;
    InventoryPage inventoryPage = new InventoryPage(driver);

    @Then("User already on inventory page")
    public void verifyLabelProduct(){
        Assert.assertTrue(inventoryPage.verifyLabelProduct());
    }
    @When("User sort product by {string}")
    public void sortProduct(String filterProduct) {
        inventoryPage.sortProduct(filterProduct);
    }
    @And("User click product {string}")
    public void clickProduct(String product) {
        inventoryPage.clickAddToCartProduct(product);
    }
    @And("User click cart button")
    public void clickCartProduct() {
        inventoryPage.clickCartProduct();
    }
}

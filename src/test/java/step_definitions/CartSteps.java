package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.example.pageObject.CartPage;

public class CartSteps {
    private final WebDriver driver = Hooks.driver;
    CartPage cartPage = new CartPage(driver);

    @And("User click remove product")
    public void clickRemoveProduct() {
        cartPage.clickRemoveProduct();
    }
    @And("User click checkout product")
    public void clickCheckoutProduct() {
        cartPage.clickCheckoutButton();
    }
}

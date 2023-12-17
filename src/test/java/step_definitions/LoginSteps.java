package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);

    @Given("User already on login page")
    public void verifyUserName(){
        Assert.assertTrue(loginPage.verifyFieldUserName());
    }
    @When("User input {string} as username")
    public void inputFieldUserName(String userName){
        loginPage.inputFieldUserName(userName);
    }
    @And("User input {string} as password")
    public void inputFieldPassword(String password){
        loginPage.inputFieldPassword(password);
    }
    @And("User click login button")
    public void clickBLoginButton(){
        loginPage.clickLoginButton();
    }
    @And("User input {string} as a username {string} as a password")
            public void inputCredential(String userName, String password) {
        loginPage.inputFieldUserName(userName);
        loginPage.inputFieldPassword(password);
        loginPage.clickLoginButton();
    }
    @Then("User see {string} as error massage")
    public void verifyErrorMassage(String errorMassage) {
        Assert.assertEquals(errorMassage, loginPage.getErrorMassage());
    }
}

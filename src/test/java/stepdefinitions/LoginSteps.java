package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;
import io.cucumber.testng.CucumberOptions;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver("edge");
    LoginPage loginPage = new LoginPage(driver);

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://devcsiqbo.cstoreiq.com/#/login");
    }

    @When("I enter username {string} and password {string}")
    public void enter_credentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("I click the login button")
    public void click_login() {
        loginPage.clickLogin();
    }

    @Then("I should be logged in successfully")
    public void verify_login() {

        DriverFactory.takeScreenshot("Loggin page");
        System.out.println("Login successful - Screenshot captured");
    }


}

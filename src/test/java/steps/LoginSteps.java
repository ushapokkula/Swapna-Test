package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HotelManagementLandingPage;
import pages.LoginPage;


import static junit.framework.Assert.assertEquals;


public class LoginSteps {
    public WebDriver driver;

    public LoginSteps()
    {
        driver = Hooks.driver;
    }

    @Given("^I navigate to trainers portal$")
    public void I_navigate_to_trainers_portal() throws Throwable {
        //new LoginPage(driver).enterURL();
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void I_enter_username(String username) throws Throwable {
        new LoginPage(driver).enterUsername(username);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void I_enter_password(String password) throws Throwable {
        new LoginPage(driver).enterPassword(password);

    }

    @And("^I click signin button$")
    public void I_click_signin_button() throws Throwable {
        new LoginPage(driver).clickSignin();
    }

    @Then("^i will login successfully$")
    public void i_will_login_successfully() throws Throwable {
        new HotelManagementLandingPage(driver).isLoggedin();
    }

}

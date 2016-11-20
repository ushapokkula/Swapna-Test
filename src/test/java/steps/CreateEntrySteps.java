package steps;


import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HotelManagementLandingPage;
import pages.LoginPage;

import java.util.List;

public class CreateEntrySteps {

    public WebDriver driver;

    public CreateEntrySteps() {
        driver = Hooks.driver;
    }

    @Given("^I navigate to the site$")
    public void I_navigate_to_the_site() throws Throwable {
        new LoginPage(driver).enterURL();
    }

    @And("^I login as an admin to the site with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void I_login_as_an_admin_to_the_site_with(String username, String password) throws Throwable {
        Thread.sleep(3000);
        new LoginPage(driver).enterUsername(username);
        new LoginPage(driver).enterPassword(password);
        new LoginPage(driver).clickSignin();

    }

    @And("^I enter \"([^\"]*)\" as hotel name$")
    public void I_enter_hotel(String hotel_name) throws Throwable {
        new HotelManagementLandingPage(driver).enterHotelName(hotel_name);

    }

    @And("^I enter \"([^\"]*)\" as address$")
    public void I_enter_address(String address) throws Throwable {
        new HotelManagementLandingPage(driver).enterAddress(address);

    }

    @And("^I enter \"([^\"]*)\" as ownner$")
    public void I_enter_as_ownner(String owner) throws Throwable {
        new HotelManagementLandingPage(driver).enterOwner(owner);

    }

    @And("^I enter \"([^\"]*)\" as phonenumber$")
    public void I_enter_as_phonenumber(String phone_number) throws Throwable {
        new HotelManagementLandingPage(driver).enterPhone(phone_number);

    }

    @And("^I enter \"([^\"]*)\" as email$")
    public void I_enter_as_email(String email) throws Throwable {
        new HotelManagementLandingPage(driver).enterEmail(email);

    }

    @When("^I click Create button$")
    public void I_click() throws Throwable {
        new HotelManagementLandingPage(driver).button();

    }

    @And("^I click \"([^\"]*)\" button$")
    public void I_click_button(String button_name) throws Throwable {
        new LoginPage(driver).clickLogin(button_name);
    }

    @Then("^I see that the record is created$")
    public void I_see_that_the_record_is_created() throws Throwable {
        Assert.assertTrue("Record Created", driver.findElement(By.className("hotelRow")).isDisplayed());
    }


    @When("^I delete the entry$")
    public void I_delete_the_entry() throws Throwable {
        if ((driver.getPageSource().contains("hotel-a"))== true)
        {
            driver.findElement(By.cssSelector(".glyphicon.glyphicon-remove.hotelDelete")).isDisplayed();
            driver.findElement(By.cssSelector(".glyphicon.glyphicon-remove.hotelDelete")).click();
        }
        else {
            new HotelManagementLandingPage(driver).createEntry();
//            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".glyphicon.glyphicon-remove.hotelDelete")).click();
        }
    }

    @Then("^I see that the record is deleted$")
    public void I_see_that_the_record_is_deleted() throws Throwable {
        Assert.assertFalse(driver.getPageSource().contains("hotel-a"));


    }

    @And("^I enter multiple entry of hotel creation with following details$")
    public void I_enter_multiple_entry_of_hotel_creation_with_following_details(DataTable userdetails) throws Exception {
        List<List<String>> data = userdetails.raw();
        int list = (data.size())-1;
        for (int i = 1; i <= list ;i++) {

                new HotelManagementLandingPage(driver).enterHotelName(data.get(i).get(0));

                new HotelManagementLandingPage(driver).enterAddress(data.get(i).get(1));

                new HotelManagementLandingPage(driver).enterOwner(data.get(i).get(2));

                new HotelManagementLandingPage(driver).enterPhone(data.get(i).get(3));

                new HotelManagementLandingPage(driver).enterEmail(data.get(i).get(4));

                new HotelManagementLandingPage(driver).button();
            Thread.sleep(3000);
            }

        }

    @Then("^I see that the three record are created$")
    public void I_see_that_the_three_record_are_created() throws Throwable {
        List<WebElement> data = driver.findElements(By.className("hotelRow"));
        Assert.assertEquals(data.size(), 3);

    }
}

    


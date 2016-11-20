package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelManagementLandingPage extends BaseClass{

    public HotelManagementLandingPage(WebDriver driver)

    {
        super(driver);
    }

    public void isLoggedin(){
        //String actual_name = "Sudiv P";
        //Assert.assertTrue(actual_name.equals(driver.findElement(By.cssSelector(".dors-user-fullname.text-capitalize")).getText()));
        Assert.assertTrue(driver.findElement(By.cssSelector("a > font")).isDisplayed());
    }

    public void enterHotelName(String hotelname){
        driver.findElement(By.id("hotelName")).sendKeys(hotelname);
    }

    public void enterAddress(String address){
        driver.findElement(By.id("address")).sendKeys(address);
    }

    public void enterOwner(String owner){
        driver.findElement(By.id("owner")).sendKeys(owner);
    }

    public void  enterPhone(String phone){
        driver.findElement(By.id("phone")).sendKeys(phone);
    }

    public void enterEmail(String email_id){
        driver.findElement(By.id("email")).sendKeys(email_id);
    }

    public void button()
    {
        driver.findElement(By.id("createHotel")).click();
        //driver.findElement(By.tagName("li")).click();
    }

    public void createEntry(){
        enterHotelName("hotel-a");
        enterAddress("address-a");
        enterOwner("owner-a");
        enterPhone("999999999");
        enterEmail("test@test.com");
        button();
    }


}

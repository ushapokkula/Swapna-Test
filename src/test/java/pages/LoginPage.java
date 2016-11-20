package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterURL() {

        driver.get("http://192.168.99.100:3003/");
    }


    public void enterUsername(String username) {
        driver.findElement(By.id("username")).sendKeys(username);

    }

    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickSignin() {
        driver.findElement(By.id("doLogin")).click();
    }

    public void clickLogin(String button_name) {
        driver.findElement(By.linkText(button_name)).click();
           }

}
package pages;

import org.openqa.selenium.WebDriver;


public  abstract class BaseClass {
    public static WebDriver driver = null;

    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }
}



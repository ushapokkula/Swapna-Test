package steps;

import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;

    @Before

        public void openBrowser()
        {

            File file = new File("C:\\projects\\DemoProjectMaven\\src\\test\\java\\support\\IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
            DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
            ieCaps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://www.bing.com/");
            driver = new InternetExplorerDriver(ieCaps);
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }


    @After
    public void embedScreenshot(Scenario scenario) {

        if(scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }

        }
        driver.quit();

    }


}

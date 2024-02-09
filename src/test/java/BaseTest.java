import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

// This is a typical set up of testing frameworks in which shared test logic is put in a base class
// so it can be inherited of other tests
public abstract class BaseTest {

    // Here we specify the firefox driver that will be used to interact with FireFox browser
    // it is protected, so it can be accessed only by classes with inherit the BaseTest class
    protected static FirefoxDriver driver;

    // Before Class is being called once before test class is run
    @BeforeClass
    public static void openBrowser(){
        // Here we instantiate the Firefox Browser so we will be able to interact with it
        // in our future tests
        driver = new FirefoxDriver();

        //Here we set Implicitly Wait so if an element is not present in the dome immediately
        // we will wait 10 seconds for it untill we will fail the execution of the tests.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // After Class is being called once after test class is run
    @AfterClass

    // After running the tests we need to close the browser so we will
    // not be left with multiple instancies of the browser
    public static void closeBrowser(){
        driver.quit();
    }
}

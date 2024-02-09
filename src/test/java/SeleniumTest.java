import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest extends BaseTest {

    @Test
    public void valid_UserCredential(){
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void inValid_UserCredential()
    {
        driver.get("https://www.saucedemo.com/");
    }

}
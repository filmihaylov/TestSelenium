import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    private static FirefoxDriver driver;
    WebElement element;

    @BeforeClass
    public static void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void valid_UserCredential(){

        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        driver.get("https://stackoverflow.com/");
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    public void inValid_UserCredential()
    {
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        driver.get("https://stackoverflow.com/");
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
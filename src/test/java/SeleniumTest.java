import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// If we inherit from the base class the driver and BeforeClass and AfterClass will be run
// This is our simple test that will check a login screen
public class SeleniumTest extends BaseTest {

    // This method is called before each test
    @Before
    public final void before() {


    }

    // this test will try to log in with valid credentials
    // and verify that the user is logged in
    @Test
    public void validUserCredentialTest(){
        driver.get("https://www.saucedemo.com/");
    }

    // this will be a negative test where we will try to log in with invalid credentials
    // and will verify that we are not logged in
    @Test
    public void inValidUserCredentialTest()
    {
        driver.get("https://www.saucedemo.com/");
    }

    // This method is called after each test
    @After
    public final void after() {


    }

}
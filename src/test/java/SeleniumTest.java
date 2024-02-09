import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


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

        // We use driver get to open a page url
        driver.get("https://www.saucedemo.com/");

        //Web element is used to interact with a dom element
        //Find element finds the element in the dom by Id, Name, x-path
        WebElement userNameField = driver.findElement(By.id("user-name"));

        // Here we enter the username to field
        userNameField.sendKeys("standard_user");

        //Web element is used to interact with a dom element
        //Find element finds the element in the dom by Id, Name, x-path
        WebElement userPasswordField = driver.findElement(By.id("password"));

        // Here we enter the password to the field
        userPasswordField.sendKeys("secret_sauce");

        // Here we get the login button element
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // we send a click event to the button
        loginButton.click();

        // we can verify that we are on the logged page
        String currentUrl = driver.getCurrentUrl();

        // testing framework like Junit provides assertions so we can
        // verfy if the url is the desired one
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", currentUrl);

        // Here we get the login page Title element
        WebElement title = driver.findElement(By.className("app_logo"));

        // we can get the text of the web element
        String titleText = title.getText();

        // testing framework like Junit provides assertions so we can
        // verify if the page title is the desired one
        Assert.assertEquals("Swag Labs", titleText);

    }

    // this will be a negative test where we will try to log in with invalid credentials
    // and will verify that we are not logged in
    @Test
    public void inValidUserCredentialTest()
    {
        driver.get("https://www.saucedemo.com/");

        //Web element is used to interact with a dom element
        //Find element finds the element in the dom by Id, Name, x-path
        WebElement userNameField = driver.findElement(By.id("user-name"));

        // Here we enter the username to field
        userNameField.sendKeys("standard_user");

        //Web element is used to interact with a dom element
        //Find element finds the element in the dom by Id, Name, x-path
        // Here we provide wrong password so the test should test that we are not logged in
        WebElement userPasswordField = driver.findElement(By.id("password"));

        // Here we enter the password to the field
        userPasswordField.sendKeys("wrong Password");

        // Here we get the login button element
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // we send a click event to the button
        loginButton.click();

        // we can verify that we are on the logged page
        String currentUrl = driver.getCurrentUrl();

        // testing framework like Junit provides assertions, so we can
        // we are on the same page
        Assert.assertEquals("https://www.saucedemo.com/", currentUrl);

        // We can get the error message and verify it by xpath
        WebElement errorBox = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[@class='error-message-container error']/h3"));

        // Here we get the text of the error box
        String errorMessage = errorBox.getText();

        // Finally we can assert the error message is the desired one
        // We can use contains string method so we can test for the part that we need to
        Assert.assertTrue(errorMessage.contains("Username and password do not match any user in this service"));


    }

    // This method is called after each test
    @After
    public final void after() {


    }

}
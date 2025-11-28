package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class BaseTests {
    public WebDriver driver;

    public HomePage homePage;
    public SamsungGalaxyS6Page samsungGalaxyS6Page;
    public CartPage cartPage;
    public AboutUsPage aboutUsPage;
    public ContactPage contactPage;
    public LoginPage loginPage;
    public SignUpPage signUpPage;
    public PlaceOrderPage placeOrderPage;

    @BeforeClass
    public void setup (){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        goHome();
    }

    @BeforeMethod
    public void goHome (){
        driver.get("https://demoblaze.com/");
    }

    @AfterClass
    public void quit (){
      driver.quit();
    }
}

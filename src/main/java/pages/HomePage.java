package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By samsungGalaxyS6Link = By.linkText("Samsung galaxy s6");

    private By signUpTab = By.xpath("(//a[@class='nav-link'])[8]");
    private By loginTab = By.xpath("(//a[@class='nav-link'])[5]");
    private By contactTab = By.xpath("(//a[@class='nav-link'])[2]");
    private By aboutUsTab = By.xpath("(//a[@class='nav-link'])[3]");
    private By cartTab = By.xpath("(//a[@class='nav-link'])[4]");

    private By homeNextButton = By.xpath("//button[@id='next2']");
    private By homePreviousButton = By.cssSelector("#prev2");
    private By homeNextIconArrow = By.cssSelector(".carousel-control-next-icon");
    private By homePreviousIconArrow = By.cssSelector(".carousel-control-prev-icon");
    private By homePhonesCategoryTab = By.xpath("//a[@onclick=\"byCat('phone')\"]");
    private By homeLaptopCategoryTab = By.xpath("//a[@onclick=\"byCat('notebook')\"]");
    private By homeMonitorsCategoryTab = By.xpath("//a[@onclick=\"byCat('monitor')\"]");

    public SamsungGalaxyS6Page clickOnSamsungGalaxyS6 (){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(samsungGalaxyS6Link));
        driver.findElement(samsungGalaxyS6Link).click();
        return new SamsungGalaxyS6Page(driver);
    }
    public SignUpPage clickOnSignUpTab ()
    {
        driver.findElement(signUpTab).click();
        return new SignUpPage(driver);
    }
    public LoginPage clickOnLoginTab (){
        driver.findElement(loginTab).click();
        return new LoginPage(driver);
    }
    public ContactPage clickOnContactTab (){
        driver.findElement(contactTab).click();
        return new ContactPage(driver);
    }
    public AboutUsPage clickOnAboutUsTab (){
        driver.findElement(aboutUsTab).click();
        return new AboutUsPage(driver);
    }
    public CartPage clickOnCartTab(){
        driver.findElement(cartTab).click();
        return new CartPage(driver);
    }

    public void clickOnHomeNextButton(){
        driver.findElement(homeNextButton).click();
    }
    public void clickOnHomePreviousButton(){
        driver.findElement(homePreviousButton).click();
    }
    public void clickOnHomeNextIconArrow(){
        driver.findElement(homeNextIconArrow).click();
    }
    public void clickOnHomePreviousIconArrow(){
        driver.findElement(homePreviousIconArrow).click();
    }
    public void clickOnHomePhonesCategoryTab(){
        driver.findElement(homePhonesCategoryTab).click();
    }
    public void clickOnHomeLaptopsCategoryTab(){
        driver.findElement(homeLaptopCategoryTab).click();
    }
    public void clickOnHomeMonitorsCategoryTab(){
        driver.findElement(homeMonitorsCategoryTab).click();
    }

    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}

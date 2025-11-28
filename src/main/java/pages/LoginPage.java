package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By loginUsernameBox = By.cssSelector("#loginusername");
    private By loginPasswordBox = By.cssSelector("#loginpassword");
    private By loginButton = By.xpath("//button[@onclick='logIn()']");
    private By loggedUsername = By.cssSelector("#nameofuser");

    public void insertLoginUsername (String username){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginUsernameBox));
        driver.findElement(loginUsernameBox).sendKeys(username);
    }
    public void insertLoginPassword (String password){
        driver.findElement(loginPasswordBox).sendKeys(password);
    }
    public void clickOnLoginButton (){
        driver.findElement(loginButton).click();
    }
    public String getLoggedUsername (){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loggedUsername));
        String username = driver.findElement(loggedUsername).getText();
        return username;
    }

    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

}

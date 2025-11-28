package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {
    WebDriver driver;
    WebDriverWait wait;
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private By signUpUsernameBox = By.cssSelector("#sign-username");
    private By signUpPasswordBox = By.cssSelector("#sign-password");
    private By signUpButton = By.xpath("//button[@onclick='register()']");

    public void insertSignUpUsername (String username){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(signUpUsernameBox));
        driver.findElement(signUpUsernameBox).sendKeys(username);
    }
    public void insertSignUpPassword (String password){
        driver.findElement(signUpPasswordBox).sendKeys(password);
    }
    public void clickOnSignUpButton (){
        driver.findElement(signUpButton).click();
    }

    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    public String getAlertMessage(){
        String message = driver.switchTo().alert().getText();
        return message;
    }
}

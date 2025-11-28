package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactPage {
    WebDriver driver;
    WebDriverWait wait;
    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    private By contactEmailBox = By.cssSelector("#recipient-email");
    private By contactNameBox = By.cssSelector("#recipient-name");
    private By contactMessageBox = By.cssSelector("#message-text");
    private By contactSendMessageButton = By.xpath("//button[@onclick='send()']");

    public void insertContactEmail (String email){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(contactEmailBox));
        driver.findElement(contactEmailBox).sendKeys(email);
    }
    public void insertContactName (String name){
        driver.findElement(contactNameBox).sendKeys(name);
    }
    public void insertContactMessage(String message){
        driver.findElement(contactMessageBox).sendKeys(message);
    }
    public void clickOnContactSendMessageButton(){
        driver.findElement(contactSendMessageButton).click();
    }

    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}

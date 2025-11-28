package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutUsPage {
    WebDriver driver;
    WebDriverWait wait;
    public AboutUsPage(WebDriver driver) {

        this.driver = driver;
    }
    private By aboutUsVideo = By.cssSelector("#example-video");
    private By aboutUsCloseButton = By.xpath("(//button[@class='btn btn-secondary'])[4]");

    public void clickOnAboutUsVideo(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(aboutUsVideo));
        driver.findElement(aboutUsVideo).click();
    }
    public void clickOnAboutUsCloseButton(){
        driver.findElement(aboutUsCloseButton).click();
    }

    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}

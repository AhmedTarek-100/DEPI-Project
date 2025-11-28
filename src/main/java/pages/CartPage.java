package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By placeOrderButton = By.xpath("//button[@data-target='#orderModal']");

    public PlaceOrderPage clickOnPlaceOrderButton (){
        driver.findElement(placeOrderButton).click();
        return new PlaceOrderPage(driver);
    }

    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}

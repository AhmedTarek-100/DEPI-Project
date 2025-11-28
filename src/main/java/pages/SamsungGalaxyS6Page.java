package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SamsungGalaxyS6Page {
    WebDriver driver;
    WebDriverWait wait;
    public SamsungGalaxyS6Page(WebDriver driver) {
        this.driver = driver;
    }
    private By samsungGalaxyS6AddToCartButton = By.xpath("//a[@onclick='addToCart(1)']");
    private By cartTab = By.xpath("//a[@href='cart.html']");

    public void clickOnSamsungGalaxyS6AddToCartButton(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(samsungGalaxyS6AddToCartButton));
        driver.findElement(samsungGalaxyS6AddToCartButton).click();
    }
    public CartPage clickOnCartTab(){
        driver.findElement(cartTab).click();
        return new CartPage(driver);
    }

    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}

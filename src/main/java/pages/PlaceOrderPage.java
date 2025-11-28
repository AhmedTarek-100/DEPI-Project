package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaceOrderPage {
    WebDriver driver;
    WebDriverWait wait;
    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    private By placeOrderName = By.cssSelector("#name");
    private By placeOrderCountryBox = By.cssSelector("#country");
    private By placeOrderCityBox = By.cssSelector("#city");
    private By placeOrderCreditCardBox = By.cssSelector("#card");
    private By placeOrderMonthBox = By.cssSelector("#month");
    private By placeOrderYearBox = By.cssSelector("#year");
    private By placeOrderPurchaseButton = By.xpath("//button[@onclick='purchaseOrder()']");
    private By purchaseSuccessMessage = By.xpath("(//h2)[3]");

    public void insertPlaceOrderName (String name){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderName));
        driver.findElement(placeOrderName).sendKeys(name);
    }
    public void insertPlaceOrderCountry (String country){
        driver.findElement(placeOrderCountryBox).sendKeys(country);
    }
    public void insertPlaceOrderCity (String city){
        driver.findElement(placeOrderCityBox).sendKeys(city);
    }
    public void insertPlaceOrderCreditCard (String card){
        driver.findElement(placeOrderCreditCardBox).sendKeys(card);
    }
    public void insertPlaceOrderMonth (String month){
        driver.findElement(placeOrderMonthBox).sendKeys(month);
    }
    public void insertPlaceOrderYear (String year){
        driver.findElement(placeOrderYearBox).sendKeys(year);
    }
    public void clickOnPlaceOrderPurchaseButton (){
        driver.findElement(placeOrderPurchaseButton).click();
    }
    public String getPurchaseSuccessMessage(){
        String message = driver.findElement(purchaseSuccessMessage).getText();
        return message;
    }

    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}

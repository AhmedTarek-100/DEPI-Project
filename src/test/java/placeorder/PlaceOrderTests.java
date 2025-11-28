package placeorder;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceOrderTests extends BaseTests {
    @Test
    public void placeOrder(){
        cartPage = homePage.clickOnCartTab();
        placeOrderPage = cartPage.clickOnPlaceOrderButton();
        placeOrderPage.insertPlaceOrderName("ahmed");
        placeOrderPage.insertPlaceOrderCountry("egypt");
        placeOrderPage.insertPlaceOrderCity("cairo");
        placeOrderPage.insertPlaceOrderCreditCard("411111111111111");
        placeOrderPage.insertPlaceOrderMonth("10");
        placeOrderPage.insertPlaceOrderYear("2030");

        placeOrderPage.clickOnPlaceOrderPurchaseButton();

        String expectedResult = "Thank you for your purchase!";
        String actualResult = placeOrderPage.getPurchaseSuccessMessage();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}

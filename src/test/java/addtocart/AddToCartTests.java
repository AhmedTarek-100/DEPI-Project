package addtocart;

import base.BaseTests;
import org.testng.annotations.Test;

public class AddToCartTests extends BaseTests {
@Test
    public void addToCart() {
    samsungGalaxyS6Page = homePage.clickOnSamsungGalaxyS6();
    samsungGalaxyS6Page.clickOnSamsungGalaxyS6AddToCartButton();
    samsungGalaxyS6Page.acceptAlert();
    cartPage = samsungGalaxyS6Page.clickOnCartTab();
}


}

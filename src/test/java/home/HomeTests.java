package home;

import base.BaseTests;
import org.testng.annotations.Test;

public class HomeTests extends BaseTests {
    @Test
    public void home () throws InterruptedException{
        Thread.sleep(1000);
        homePage.clickOnHomeNextButton();
        Thread.sleep(1000);
        homePage.clickOnHomePreviousButton();
        Thread.sleep(1000);
        homePage.clickOnHomeNextIconArrow();
        Thread.sleep(1000);
        homePage.clickOnHomeNextIconArrow();
        Thread.sleep(1000);
        homePage.clickOnHomeNextIconArrow();
        Thread.sleep(1000);
        homePage.clickOnHomePreviousIconArrow();
        Thread.sleep(1000);
        homePage.clickOnHomePreviousIconArrow();
        Thread.sleep(1000);
        homePage.clickOnHomePreviousIconArrow();
        Thread.sleep(1000);
        homePage.clickOnHomePhonesCategoryTab();
        Thread.sleep(1000);
        homePage.clickOnHomeLaptopsCategoryTab();
        Thread.sleep(1000);
        homePage.clickOnHomeMonitorsCategoryTab();
        Thread.sleep(1000);
    }
}

package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {
    @Test (priority = 1)
    public void login (){
        loginPage = homePage.clickOnLoginTab();
        loginPage.insertLoginUsername("AhmedTarek947");
        loginPage.insertLoginPassword("123");
        loginPage.clickOnLoginButton();
        String expectedResult = "Welcome AhmedTarek947";
        String actualResult = loginPage.getLoggedUsername();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Test (priority = 2)
    public void invalidUsername (){
        loginPage = homePage.clickOnLoginTab();
        loginPage.insertLoginUsername("Ahmed");
        loginPage.insertLoginPassword("123");
        loginPage.clickOnLoginButton();
    }
    @Test (priority = 3)
    public void invalidPassword (){
        loginPage = homePage.clickOnLoginTab();
        loginPage.insertLoginUsername("AhmedTarek947");
        loginPage.insertLoginPassword("321");
        loginPage.clickOnLoginButton();
    }

}

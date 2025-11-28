package signup;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUpTests extends BaseTests {
    @Test
    public void signUp (){
        signUpPage = homePage.clickOnSignUpTab();
        signUpPage.insertSignUpUsername("AhmedTarek10032462642352640");
        signUpPage.insertSignUpPassword("123");
        signUpPage.clickOnSignUpButton();
        String actualResult = signUpPage.getAlertMessage();
        signUpPage.acceptAlert();
        String expectedResult = "Sign up successful.";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}

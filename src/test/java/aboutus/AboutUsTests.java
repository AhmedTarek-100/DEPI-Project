package aboutus;

import base.BaseTests;
import org.testng.annotations.Test;

public class AboutUsTests extends BaseTests {
    @Test
    public void aboutUs(){
        aboutUsPage = homePage.clickOnAboutUsTab();
        aboutUsPage.clickOnAboutUsVideo();
        aboutUsPage.clickOnAboutUsCloseButton();
    }
}

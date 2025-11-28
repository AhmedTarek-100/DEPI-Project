package contact;

import base.BaseTests;
import org.testng.annotations.Test;

public class ContactTests extends BaseTests {
    @Test
    public void contact (){
        contactPage = homePage.clickOnContactTab();
        contactPage.insertContactEmail("ahmed@gmail.com");
        contactPage.insertContactName("Ahmed Tarek");
        contactPage.insertContactMessage("Hi, it's a test!");
        contactPage.clickOnContactSendMessageButton();
        contactPage.acceptAlert();
    }
}

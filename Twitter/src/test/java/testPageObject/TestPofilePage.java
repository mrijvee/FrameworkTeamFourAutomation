package testPageObject;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.ProfilePage;
import pageobjects.TwitterHomePage;

public class TestPofilePage extends CommonAPI{

    @Test
    public void checkNotification() throws InterruptedException {
        TwitterHomePage notification = PageFactory.initElements(driver, TwitterHomePage.class);
        notification.logInProcess("saha4311@gmail.com", "Yes171717");

        ProfilePage moments = PageFactory.initElements(driver, ProfilePage.class);
        moments.goMoments();
    }
}

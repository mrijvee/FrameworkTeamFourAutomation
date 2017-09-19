package testPageObject;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.ProfilePage;
import pageobjects.TwitterHomePage;

import static base.CommonAPI.driver;
import static base.CommonAPI.driver;

public class TestPofilePage extends CommonAPI {

//    @Test
//    public void checkNotification() throws InterruptedException {
//
//
//        ProfilePage moments = PageFactory.initElements(driver, ProfilePage.class);
//        moments.goMoments();
//    }

    @Test
    public void goAddPhoto() throws InterruptedException {
        TwitterHomePage notification = PageFactory.initElements(driver, TwitterHomePage.class);
        notification.logInProcess("saha4311@gmail.com", "Yes171717");

        ProfilePage addphoto = PageFactory.initElements(driver, ProfilePage.class);
        addphoto.goAddPhoto();
    }
}

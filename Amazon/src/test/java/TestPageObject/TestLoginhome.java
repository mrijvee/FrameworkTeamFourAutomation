package TestPageObject;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.LogInHome;

import static base.CommonAPI.driver;

public class TestLoginhome extends CommonAPI{
@Test
    public void orders() throws InterruptedException {
        LogInHome loginHome = PageFactory.initElements(driver, LogInHome.class);
        loginHome.orderList();
        HomePage loginAllow = PageFactory.initElements(driver,HomePage.class);
        loginAllow.logIn();

    }
}

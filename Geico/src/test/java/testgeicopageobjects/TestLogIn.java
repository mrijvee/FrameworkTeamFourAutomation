package testgeicopageobjects;

import base.CommonAPI;
import geicopageobjects.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogIn extends CommonAPI {

    @Test
    public void testSignIn() throws InterruptedException {
        LogIn logIn = PageFactory.initElements(driver, LogIn.class);
        logIn.signInHover("Sasuke125", "Uchiha231");
    }
}

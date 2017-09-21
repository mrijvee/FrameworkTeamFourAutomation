package testgeicopageobjects;

import base.CommonAPI;
import geicopageobjects.SignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSignUp extends CommonAPI {

    @Test
    public void testSignUp() {
        SignUp signUp = PageFactory.initElements(driver, SignUp.class);
        try {
            signUp.setSignUp("543216", "10/31/1994", "11238");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
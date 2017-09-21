package PageObject;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static base.CommonAPI.driver;

public class TestSingInPage extends CommonAPI {

    @Test
    public void testSignUp() throws InterruptedException {
        SingInPage signIn = PageFactory.initElements(driver, SingInPage.class);
        signIn.goSignUpPage();

    }
}

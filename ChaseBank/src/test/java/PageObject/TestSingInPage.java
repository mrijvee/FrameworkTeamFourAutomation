package PageObject;


import base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

import static base.CommonAPI.driver;

public class TestSingInPage extends CommonAPI {

    @Test
    public void testSignUp() throws InterruptedException {
        SingInPage signIn = PageFactory.initElements(driver, SingInPage.class);
        signIn.goSignUpPage();

    }
}

package testPageObject;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.annotations.Test;
import pageObject.Banking;

public class TestCasesHomePage extends CommonAPI {
    @Test
    public void testBankingHover() throws InterruptedException {
        Banking testbank = PageFactory.initElements(driver, Banking.class);
        testbank.bankingHover("", "savings","","","","","");
    }

   // @Test
    public void basicDropDown() {
        Banking testbank = PageFactory.initElements(driver, Banking.class);
        testbank.selectDropDown("AZ");

    }
}
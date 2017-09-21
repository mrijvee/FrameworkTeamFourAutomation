package testPageObject;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.annotations.Test;
import pageObject.Banking;

import static base.CommonAPI.driver;

public class TestCasesHomePage {
    @Test
    public void testBankingHover() throws InterruptedException {
        Banking testbank = PageFactory.initElements( driver,Banking.class);
        testbank.bankingHover();
    }
}

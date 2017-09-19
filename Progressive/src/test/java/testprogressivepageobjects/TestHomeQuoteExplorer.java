package testprogressivepageobjects;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import progressivepageobjects.HomeQuoteExplorer;

public class TestHomeQuoteExplorer extends CommonAPI {

    @Test
    public void testHomeOwnersQuote() throws InterruptedException {
        HomeQuoteExplorer getAQuoteForHomeOwners = PageFactory.initElements(driver, HomeQuoteExplorer.class);
        getAQuoteForHomeOwners.homeOwnersQuote("11103", "31-19 38th St", "2");
    }
}

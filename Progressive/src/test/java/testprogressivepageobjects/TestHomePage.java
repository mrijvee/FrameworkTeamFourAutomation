package testprogressivepageobjects;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import progressivepageobjects.HomePage;

public class TestHomePage extends CommonAPI{

    @Test
    public void testInsuranceHoverOver() {
        HomePage getListsOfInsurances = PageFactory.initElements(driver, HomePage.class);
        try {
            getListsOfInsurances.setInsuranceHoverOver();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

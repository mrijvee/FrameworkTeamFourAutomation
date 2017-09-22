package test_edward_jones;

import base.CommonAPI;
import edward_jones.EdwardJonesLifeCalculator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestEdwardJonesLifeCalculator extends CommonAPI {

    @Test(priority = 0)
    public void lifeInsuranceCalculator() throws InterruptedException{
        EdwardJonesLifeCalculator life = PageFactory.initElements(driver,EdwardJonesLifeCalculator.class);
        life.setFinalExpenses();
    }
}

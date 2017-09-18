package pageobjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends CommonAPI {

    @FindBy(xpath = ".//*[@id='global-actions']/li[2]/a/span[3]")
    public static WebElement mommentsBox;

    public void goMoments() throws InterruptedException {
        mommentsBox.click();
        Thread.sleep(1500);
    }
}



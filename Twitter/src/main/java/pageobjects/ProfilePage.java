package pageobjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends CommonAPI {

    @FindBy(xpath = ".//*[@id='global-actions']/li[2]/a/span[3]")
    public static WebElement mommentsBox;

    @FindBy(xpath = ".//*[@id='page-container']/div[2]/div[2]/div/ul/li[4]/a")
    public static WebElement addPhotoBox;

    @FindBy(xpath = ".//*[@id='page-container']/div[2]/div[2]/div/ul/li[1]/a")
    public static WebElement topBox;

    public void goMoments() throws InterruptedException {
        mommentsBox.click();
        Thread.sleep(1500);
    }
    public void goAddPhoto() throws InterruptedException {
        addPhotoBox.click();
        Thread.sleep(1500);
    }

    public void goTop() throws InterruptedException {
        topBox.click();
        Thread.sleep(1500);
    }

}



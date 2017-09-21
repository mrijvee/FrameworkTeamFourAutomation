package PageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingInPage extends CommonAPI {
    @FindBy(how = How.XPATH, using = "html/body/div[2]/div[4]/nav/div/div[2]/div/ul/li[2]/a/p")
    public static WebElement singInBox;

    public void goSignUpPage() throws InterruptedException {
        singInBox.click();
        Thread.sleep(1500);
    }
}

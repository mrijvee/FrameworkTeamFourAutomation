package PageObject;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends CommonAPI {

    @FindBy(how = How.ID, using = "skip-sidemenu")
    public static WebElement menuBox;

    @FindBy(how = How.XPATH, using = "html/body/div[2]/div[4]/nav/div/div[2]/div/ul/li[2]/a/p")
    public static WebElement singInBox;

    public void MenuBar(){
      menuBox.click();
    }

    public void goSignUpPage() throws InterruptedException {
        singInBox.click();

    }

    //WebDriverWait wait = new WebDriverWait(driver, 10);
    //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

}
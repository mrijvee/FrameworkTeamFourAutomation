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

    public void MenuBar(){
      menuBox.click();
    }
}
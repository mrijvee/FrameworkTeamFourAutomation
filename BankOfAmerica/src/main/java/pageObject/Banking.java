package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static base.CommonAPI.driver;

public class Banking {
    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[1]/a")
    public static WebElement banking;
//    @FindBy(how =How.XPATH, using = ".//*[@id='pm-submenu-first']/div[1]/a[1]")
//    public static WebElement checking;
//    @FindBy(how = How.XPATH,using = ".//*[@id='pm-submenu-first']/div[1]/a[2]")
//    public static WebElement savings;

    public void bankingHover() {
        Actions act = new Actions(driver);
        act.moveToElement(banking).perform();
//        act.moveToElement(checking).perform();
//        act.moveToElement(savings).perform();
    }
}
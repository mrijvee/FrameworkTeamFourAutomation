package progressivepageobjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='insurance']")
    public static WebElement insuranceHoverOver;
    @FindBy(how = How.XPATH, using = ".//*[@id='insurance-flyout']/li/ul/li[1]/div[1]/ul[1]/li[1]/a")
    public static WebElement insuranceATVHoverOver;
    @FindBy(how = How.XPATH, using = ".//*[@id='insurance-flyout']/li/ul/li[1]/div[1]/ul[1]/li[2]/a")
    public static WebElement insuranceAutoHoverOver;
    @FindBy(how = How.XPATH, using = ".//*[@id='insurance-flyout']/li/ul/li[1]/div[1]/ul[1]/li[3]/a")
    public static WebElement insuranceBoatHoverOver;
    @FindBy(how = How.XPATH, using = ".//*[@id='insurance-flyout']/li/ul/li[1]/div[1]/ul[1]/li[4]/a")
    public static WebElement insuranceClassicCarHoverOver;
    @FindBy(how = How.XPATH, using = ".//*[@id='insurance-flyout']/li/ul/li[1]/div[1]/ul[1]/li[5]/a")
    public static WebElement insuranceGolfCartHoverOver;

    public void setInsuranceHoverOver() throws InterruptedException {
        Actions insuranceHover = new Actions(driver);
        insuranceHover.moveToElement(insuranceHoverOver).perform();
        Thread.sleep(1000);
        insuranceHover.moveToElement(insuranceATVHoverOver).perform();
        Thread.sleep(1000);
        insuranceHover.moveToElement(insuranceAutoHoverOver).perform();
        Thread.sleep(1000);
        insuranceHover.moveToElement(insuranceBoatHoverOver).perform();
        Thread.sleep(1000);
        insuranceHover.moveToElement(insuranceClassicCarHoverOver).perform();
        Thread.sleep(1000);
        insuranceHover.moveToElement(insuranceGolfCartHoverOver).perform();
        Thread.sleep(1000);
    }
}

package pageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Sleeper;

public class LogInHome extends CommonAPI{
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-orders']/span[2]")
    public static WebElement order;

    public void orderList() throws InterruptedException {
        order.click();
        Thread.sleep(1500);
    }
}

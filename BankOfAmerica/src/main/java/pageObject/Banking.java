package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static base.CommonAPI.driver;

public class Banking {
    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[1]/a")
    public static WebElement banking;
    @FindBy(how = How.XPATH, using = ".//*[@id='pm-submenu-first']/div[1]/a[1]")
    public static WebElement checking;
    @FindBy(how = How.XPATH, using = ".//*[@id='pm-submenu-first']/div[1]/a[2]")
    public static WebElement savings;
    @FindBy(how = How.XPATH, using = ".//*[@id='pm-submenu-first']/div[1]/a[3]")
    public static WebElement cd;
    @FindBy(how = How.XPATH, using = ".//*[@id='pm-submenu-first']/div[1]/a[4]")
    public static WebElement businessChecking;
    @FindBy(how = How.XPATH, using = ".//*[@id='pm-submenu-first']/div[1]/a[5]")
    public static WebElement studentBanking;
    @FindBy(how = How.XPATH, using = ".//*[@id='pm-submenu-first']/div[1]/a[6]")
    public static WebElement onlineBanking;
    @FindBy(how = How.XPATH, using = ".//*[@id='pm-submenu-first']/div[1]/a[7]")
    public static WebElement mobileBanking;
    @FindBy(how = How.XPATH, using = ".//*[@id='zipCodeModalInputField']")
    public static WebElement zipCode;
    @FindBy(how = How.XPATH, using = ".//*[@id='go-button-zip-modal']")
    public static WebElement goButton;

    @FindBy(how = How.XPATH, using = "//select[@id='pick_state']")
    public static WebElement findState;
//    @FindBy(how =How.XPATH,using = "")
//    public static WebElement

    public void bankingHover(String setChecking, String setSavings, String setCD, String setBusinessChecking,
                             String setStudentBanking, String setOnlineBanking, String setMobileBanking) throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(banking).perform();
        act.moveToElement(checking).perform();
        act.moveToElement(savings).perform();
        if (setChecking.equalsIgnoreCase("checking")) {
            checking.click();
            Thread.sleep(3000);
        }
        else if (setSavings.equalsIgnoreCase("savings")) {
            savings.click();
            Thread.sleep(5000);
        }
    }
    public void selectDropDown(String dropvalue) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        findState.click();
        Select State = new Select(driver.findElement(By.name("prefState")));
        State.selectByValue(dropvalue);
        State.selectByValue(dropvalue);

    }
}

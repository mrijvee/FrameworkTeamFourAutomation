package geicopageobjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogIn extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='header-right-links']/ul[1]/li[2]/a/span")
    public static WebElement loginHover;
    @FindBy(how = How.NAME, using = "userName")
    public static WebElement userName;
    @FindBy(how = How.NAME, using = "userPassword")
    public static WebElement userPassword;
    @FindBy(how = How.XPATH, using = ".//*[@id='manageSubmit']")
    public static WebElement logInBox;

    public void signInHover(String inputUserName, String inputUserPass) throws InterruptedException {
        Actions signIn = new Actions(driver);
        signIn.moveToElement(loginHover).perform();
        Thread.sleep(1000);
        userName.sendKeys(inputUserName);
        userPassword.sendKeys(inputUserPass);
        Thread.sleep(1000);
        logInBox.click();
        Thread.sleep(1000);
    }
}


package geicopageobjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUp extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='header-right-links']/ul[1]/li[2]/a/span")
    public static WebElement signUpHover;
    @FindBy(how = How.XPATH, using = ".//*[@id='manage_ecams_form']/ul/li[2]/a")
    public static WebElement createAccountBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='form:policyNumber']")
    public static WebElement policyNumber;
    @FindBy(how = How.XPATH, using = ".//*[@id='form:dateOfBirth']")
    public static WebElement dob;
    @FindBy(how = How.XPATH, using = ".//*[@id='form:zipCode']")
    public static WebElement zipCode;
    @FindBy(how = How.XPATH, using = ".//*[@id='form:continue']")
    public static WebElement signUpSubmitBox;

    public void setSignUp(String inputPolicyNum, String inputDOB, String inputZipCode) throws InterruptedException {
        Actions signUp = new Actions(driver);
        signUp.moveToElement(signUpHover).perform();
        Thread.sleep(1500);
        createAccountBox.click();
        Thread.sleep(1500);
        policyNumber.sendKeys(inputPolicyNum);
        dob.sendKeys(inputDOB);
        zipCode.sendKeys(inputZipCode);
        Thread.sleep(1500);
        signUpSubmitBox.click();
        Thread.sleep(1500);
    }
}
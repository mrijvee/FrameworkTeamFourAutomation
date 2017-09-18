package pageobjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeQuoteExplorer extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='local-nav']/ul/li/ul/li[2]/a")
    public static WebElement homeOwnerQuoteCoverages;
    @FindBy(how = How.XPATH, using = ".//*[@id='local-nav']/ul/li/ul/li[3]/a")
    public static WebElement homeOwnerQuoteFaqs;
    @FindBy(how = How.XPATH, using = ".//*[@id='local-nav']/div/div/a/span")
    public static WebElement getHomeOwnerQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='zipCode_modal']")
    public static WebElement zipCodeToGetHomeOwnerQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='qsButton_modal']")
    public static WebElement getHomeOwnerQuoteSubmitBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='unitNumberCheckText']/span")
    public static WebElement includeUnitAndAptNumForHomeOwner;
    @FindBy(how = How.XPATH, using = ".//*[@id='singleLineAddress']")
    public static WebElement homeAddBoxForHomeOwner;
    @FindBy(how = How.XPATH, using = ".//*[@id='secondLineAddress']")
    public static WebElement aptAndUnitBoxForHomeOwner;
    @FindBy(how = How.XPATH, using = ".//*[@id='paButtonSingleLine']")
    public static WebElement submitBoxForHomeOwner;

    public void homeOwnersQuote(String inputZipCodeToGetHomeOwnerQuote, String enterHomeAddForHomeOwner, String enterAptNum) throws InterruptedException {
        homeOwnerQuoteCoverages.click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        homeOwnerQuoteFaqs.click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        getHomeOwnerQuote.click();
        Thread.sleep(1000);
        zipCodeToGetHomeOwnerQuote.sendKeys(inputZipCodeToGetHomeOwnerQuote);
        getHomeOwnerQuoteSubmitBox.click();
        Thread.sleep(1000);
        includeUnitAndAptNumForHomeOwner.click();
        Thread.sleep(1000);
        homeAddBoxForHomeOwner.sendKeys(enterHomeAddForHomeOwner);
        aptAndUnitBoxForHomeOwner.sendKeys(enterAptNum);
        Thread.sleep(1000);
        submitBoxForHomeOwner.click();
    }
}

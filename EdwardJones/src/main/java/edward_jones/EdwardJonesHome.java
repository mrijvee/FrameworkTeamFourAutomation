package edward_jones;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.concurrent.TimeUnit;

public class EdwardJonesHome extends CommonAPI {

    @FindBy(how = How.XPATH, using =".//*[@id='mainNav_0']/a")
    private static WebElement valueOfEdwardJones;
    @FindBy(how = How.XPATH, using = ".//*[@id='mainNav_1']/a")
    private static WebElement investmentsNServices;
    @FindBy(how = How.XPATH, using =".//*[@id='mainNav_2']/a")
    private static WebElement preparingYourFuture;
    @FindBy(how = How.XPATH, using = ".//*[@id='mainNav_3']/a")
    private static WebElement marketNewsAndGuidance;
    @FindBy(how = How.XPATH, using =".//*[@id='accountAccessDefault']/a")
    private static WebElement clientLogin;
    @FindBy(how = How.XPATH, using = ".//*[@id='nav']/div[2]/ul/li[3]/a")
    private static WebElement disclosures;
    @FindBy(how = How.XPATH, using =".//*[@id='nav']/div[2]/ul/li[4]/a")
    private static WebElement careers;
    @FindBy(how = How.XPATH, using = ".//*[@id='page-home']/div[2]/div[2]/div[1]/div/a")
    private static WebElement retirmentSavingsCalculator;
    @FindBy(how = How.XPATH, using =".//*[@id='page-home']/div[2]/div[2]/div[2]/div/a")
    private static WebElement savingsCalculator;
    @FindBy(how = How.XPATH, using = ".//*[@id='page-home']/div[2]/div[2]/div[3]/div/a")
    private static WebElement lifeInsuranceCalculator;

    public void setValueOfEdwardJones() throws InterruptedException{
        valueOfEdwardJones.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setInvestmentsNServices() throws InterruptedException{
        investmentsNServices.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setPreparingYourFuture() throws InterruptedException{
        preparingYourFuture.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setMarketNewsAndGuidance() throws InterruptedException{
        marketNewsAndGuidance.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setClientLogin() throws InterruptedException{
        clientLogin.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setDisclosures() throws InterruptedException{
        disclosures.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setCareers() throws InterruptedException{
        careers.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setRetirmentSavingsCalculator() throws InterruptedException{
        retirmentSavingsCalculator.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setSavingsCalculator() throws InterruptedException{
        savingsCalculator.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setLifeInsuranceCalculator() throws InterruptedException{
        lifeInsuranceCalculator.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

}

package edward_jones;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EdwardJonesLifeCalculator extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='FinalExpenses']")
    public static WebElement finalExpenses;
    @FindBy(how = How.XPATH, using = ".//*[@id='Mortgage']")
    public static WebElement mortgage;
    @FindBy(how = How.XPATH, using = ".//*[@id='OtherDebts']")
    public static WebElement otherDebts;
    @FindBy(how = How.XPATH, using = ".//*[@id='EmergencyFund']")
    public static WebElement emergencyFund;
    @FindBy(how = How.XPATH, using = ".//*[@id='EducationFund']")
    public static WebElement educationFund;
    @FindBy(how = How.XPATH, using = ".//*[@id='SurvivorShortfall']")
    public static WebElement survivorIncome;
    @FindBy(how = How.XPATH, using = ".//*[@id='YearsNeeded']")
    public static WebElement yearsOfIncome;
    @FindBy(how = How.XPATH, using = ".//*[@id='SavingsInvestments']")
    public static WebElement mySavings;
    @FindBy(how = How.XPATH, using = ".//*[@id='RetirementSavings']")
    public static WebElement myRetirementSavings;
    @FindBy(how = How.XPATH, using = ".//*[@id='OtherAssets']")
    public static WebElement otherAssets;
    @FindBy(how = How.XPATH, using = ".//*[@id='CurrentInsurance']")
    public static WebElement currentInsurance;
    @FindBy(how = How.XPATH, using = ".//*[@id='calculateInsurance']")
    public static WebElement calculate;

    public void setFinalExpenses() throws InterruptedException{
        finalExpenses.click();
        finalExpenses.sendKeys("20000", Keys.ENTER);
        mortgage.click();
        mortgage.sendKeys("100000", Keys.ENTER);
        otherDebts.click();
        otherDebts.sendKeys("50000", Keys.ENTER);
        emergencyFund.click();
        emergencyFund.sendKeys("10000", Keys.ENTER);
        educationFund.click();
        educationFund.sendKeys("200000", Keys.ENTER);
        survivorIncome.click();
        survivorIncome.sendKeys("85000", Keys.ENTER);
        yearsOfIncome.click();
        yearsOfIncome.sendKeys("5", Keys.ENTER);
        mySavings.click();
        mySavings.sendKeys("60000", Keys.ENTER);
        myRetirementSavings.click();
        myRetirementSavings.sendKeys("125000",Keys.ENTER);
        otherAssets.click();
        otherAssets.sendKeys("55000",Keys.ENTER);
        currentInsurance.click();
        currentInsurance.sendKeys("200000",Keys.ENTER);
        Thread.sleep(3250);
    }






}

package northwestern_home;


import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.concurrent.TimeUnit;

public class NorthwesternMutualHome extends CommonAPI {

    @FindBy(how = How.XPATH, using = "html/body/section[2]/a")
    private static WebElement letsTalk;
    @FindBy(how = How.XPATH, using = "html/body/header/div/ul[1]/li[1]/a")
    private static WebElement whoWeAre;
    @FindBy(how = How.XPATH, using ="html/body/header/div/ul[1]/li[2]/a")
    private static WebElement planningServices;
    @FindBy(how = How.XPATH, using = "html/body/header/div/ul[1]/li[3]/a")
    private static WebElement insurance;
    @FindBy(how = How.XPATH, using = "html/body/header/div/ul[1]/li[4]/a")
    private static WebElement investments;
    @FindBy(how = How.XPATH, using = "html/body/header/div/ul[1]/li[5]/a")
    private static WebElement lifeAndMoney;
    @FindBy(how = How.XPATH, using = "html/body/header/div/ul[2]/li[1]/a")
    private static WebElement findAdvisor;
    @FindBy(how = How.XPATH, using = "html/body/header/div/ul[2]/li[2]/a")
    private static WebElement claims;
    @FindBy(how = How.XPATH, using = "html/body/header/div/ul[2]/li[3]/label")
    private static WebElement logIn;
    @FindBy(how = How.XPATH, using = "html/body/header/div/ul[3]/li[1]/label[1]")
    private static WebElement search;
    @FindBy(how=How.XPATH, using = "html/body/nm-search-page/div/div[2]/form/input")
    private static WebElement searchBox;

    public void setLetsTalk() throws InterruptedException{
        letsTalk.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setWhoWeAre() throws InterruptedException{
        whoWeAre.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setPlanningServices() throws InterruptedException{
        planningServices.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setInsurance() throws InterruptedException{
        insurance.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setInvestments() throws InterruptedException{
        investments.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setLifeAndMoney() throws InterruptedException{
        lifeAndMoney.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setFindAdvisor() throws InterruptedException{
        findAdvisor.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setClaims() throws InterruptedException{
        claims.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setLogIn() throws InterruptedException{
        claims.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void setSearch()throws InterruptedException{
        search.click();
        searchBox.sendKeys("David Bonomi", Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
}

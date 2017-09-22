package goldman_home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.concurrent.TimeUnit;

public class GoldmanHome extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='marketing-nav']/li[2]/a")
    private static WebElement whoWeAre;
    @FindBy(how = How.XPATH, using = ".//*[@id='marketing-nav']/li[3]/a")
    private static WebElement whatWeDo;
    @FindBy(how = How.XPATH, using = ".//*[@id='marketing-nav']/li[4]/a")
    private static WebElement ourThinking;
    @FindBy(how = How.XPATH, using = ".//*[@id='marketing-nav']/li[5]/a")
    private static WebElement citizenship;
    @FindBy(how = How.XPATH, using = ".//*[@id='audience-nav']/li[1]/a")
    private static WebElement careers;
    @FindBy(how =How.XPATH, using = ".//*[@id='audience-nav']/li[2]/a")
    private static WebElement investorRelations;
    @FindBy(how = How.XPATH, using = ".//*[@id='audience-nav']/li[3]/a")
    private static WebElement mediaRelations;
    @FindBy(how = How.XPATH, using = ".//*[@id='worldwideNav']/a")
    private static WebElement worldWide;
    @FindBy(how = How.XPATH, using = ".//*[@id='loginNav']/a")
    private static WebElement login;
    @FindBy(how =How.XPATH, using = ".//*[@id='wrapper']/header/form/img")
    private static WebElement searchButton;
    @FindBy(how =How.XPATH, using = ".//*[@id='searchBox']")
    private static WebElement searchBox;

    public void setWhoWeAre() throws InterruptedException{
        whoWeAre.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setWhatWeDo() throws InterruptedException{
        whatWeDo.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setOurThinking() throws InterruptedException{
        ourThinking.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setCitizenship() throws InterruptedException{
        citizenship.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setCareers() throws InterruptedException{
        careers.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setInvestorRelations() throws InterruptedException{
        investorRelations.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setMediaRelations() throws InterruptedException{
        mediaRelations.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setWorldWide() throws InterruptedException{
        worldWide.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setLogin() throws InterruptedException{
        login.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void setSearchButton() throws InterruptedException{
        searchButton.click();
        searchBox.sendKeys("stocks");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}


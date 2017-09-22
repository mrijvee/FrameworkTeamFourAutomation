package test_goldman_home;

import base.CommonAPI;
import goldman_home.GoldmanHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestGoldmanHome extends CommonAPI {

    @Test (priority = 0)
    public void goldmanWhoWeAre() throws InterruptedException{
        GoldmanHome weAre = PageFactory.initElements(driver, GoldmanHome.class);
        weAre.setWhoWeAre();
    }
    @Test (priority = 1)
    public void goldmanWhatWeDo() throws InterruptedException{
        GoldmanHome weDo = PageFactory.initElements(driver, GoldmanHome.class);
        weDo.setWhatWeDo();
    }
    @Test (priority = 2)
    public void goldmanOurThinking() throws InterruptedException{
        GoldmanHome ourThinking = PageFactory.initElements(driver, GoldmanHome.class);
        ourThinking.setOurThinking();
    }
    @Test (priority = 3)
    public void goldmanCitizenship() throws InterruptedException{
        GoldmanHome citizen = PageFactory.initElements(driver, GoldmanHome.class);
        citizen.setCitizenship();
    }
    @Test (priority = 4)
    public void goldmanCareers() throws InterruptedException{
        GoldmanHome financeCareers = PageFactory.initElements(driver, GoldmanHome.class);
        financeCareers.setCareers();
    }
    @Test (priority = 5)
    public void goldmanInvestorRelations() throws InterruptedException{
        GoldmanHome investorRelations = PageFactory.initElements(driver, GoldmanHome.class);
        investorRelations.setInvestorRelations();
    }
    @Test (priority = 6)
    public void goldmanMediaRelations() throws InterruptedException{
        GoldmanHome mediaRelations = PageFactory.initElements(driver, GoldmanHome.class);
        mediaRelations.setMediaRelations();
    }
    @Test (priority = 7)
    public void goldmanWorldWide() throws InterruptedException{
        GoldmanHome worldWide = PageFactory.initElements(driver, GoldmanHome.class);
        worldWide.setWorldWide();
    }
    @Test(priority = 8)
    public void goldmanLogin() throws InterruptedException {
        GoldmanHome login = PageFactory.initElements(driver, GoldmanHome.class);
        login.setLogin();
    }
    @Test(priority = 9)
    public void goldmanSearch() throws InterruptedException{
        GoldmanHome search = PageFactory.initElements(driver, GoldmanHome.class);
        search.setSearchButton();
    }
}


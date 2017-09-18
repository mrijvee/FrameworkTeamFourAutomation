package test_northwestern_home;

import base.CommonAPI;
import northwestern_home.NorthwesternMutualHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestNorthwesternMutual extends CommonAPI {

    @Test(priority = 0)
    public void northwesternLetsTalk() throws InterruptedException{
        NorthwesternMutualHome talk = PageFactory.initElements(driver, NorthwesternMutualHome.class);
        talk.setLetsTalk();
    }
    @Test(priority = 1)
    public void northwesternWhoWeAre() throws InterruptedException{
        NorthwesternMutualHome who = PageFactory.initElements(driver, NorthwesternMutualHome.class);
        who.setWhoWeAre();
    }
    @Test(priority = 2)
    public void northwesternPlanningServices() throws InterruptedException{
        NorthwesternMutualHome planning = PageFactory.initElements(driver, NorthwesternMutualHome.class);
        planning.setPlanningServices();
    }
    @Test(priority = 3)
    public void northwesternInsurance() throws InterruptedException{
        NorthwesternMutualHome insurance = PageFactory.initElements(driver, NorthwesternMutualHome.class);
        insurance.setInsurance();
    }
    @Test(priority = 4)
    public void northwesternInvestments() throws InterruptedException{
        NorthwesternMutualHome invest = PageFactory.initElements(driver, NorthwesternMutualHome.class);
        invest.setInvestments();
    }
    @Test(priority = 5)
    public void northwesternLifeAndMoney() throws InterruptedException{
        NorthwesternMutualHome lifeAndMoney = PageFactory.initElements(driver, NorthwesternMutualHome.class);
        lifeAndMoney.setLifeAndMoney();
    }
    @Test(priority = 6)
    public void northwesternAdvisor() throws InterruptedException{
        NorthwesternMutualHome advisor = PageFactory.initElements(driver, NorthwesternMutualHome.class);
        advisor.setFindAdvisor();
    }
    @Test(priority = 7)
    public void northwesternClaims() throws InterruptedException{
        NorthwesternMutualHome claims = PageFactory.initElements(driver, NorthwesternMutualHome.class);
        claims.setClaims();
    }
    @Test(priority = 8)
    public void northwesternLogIn() throws InterruptedException{
        NorthwesternMutualHome logIn = PageFactory.initElements(driver, NorthwesternMutualHome.class);
        logIn.setLogIn();
    }
    @Test(priority = 9)
    public void northwesternSearch() throws InterruptedException{
        NorthwesternMutualHome search = PageFactory.initElements(driver, NorthwesternMutualHome.class);
        search.setSearch();
    }

}

package test_edward_jones;

import base.CommonAPI;
import edward_jones.EdwardJonesHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestEdwardJones extends CommonAPI {

    @Test(priority = 0)
    public void edJonesValue() throws InterruptedException{
        EdwardJonesHome value = PageFactory.initElements(driver,EdwardJonesHome.class);
        value.setValueOfEdwardJones();
    }
    @Test(priority = 1)
    public void edJonesInvesments() throws InterruptedException{
        EdwardJonesHome invesments = PageFactory.initElements(driver, EdwardJonesHome.class);
        invesments.setInvestmentsNServices();
    }
    @Test(priority = 2)
    public void edJonesPreparingFuture() throws InterruptedException{
        EdwardJonesHome preparing = PageFactory.initElements(driver, EdwardJonesHome.class);
        preparing.setPreparingYourFuture();
    }
    @Test(priority = 3)
    public void edJonesMarketNews() throws InterruptedException{
        EdwardJonesHome marketNews = PageFactory.initElements(driver, EdwardJonesHome.class);
        marketNews.setMarketNewsAndGuidance();
    }
    @Test(priority = 4)
    public void edJonesLogin() throws InterruptedException{
        EdwardJonesHome login = PageFactory.initElements(driver, EdwardJonesHome.class);
        login.setClientLogin();
    }
    @Test(priority = 5)
    public void edJonesDisclosures() throws InterruptedException{
        EdwardJonesHome disclosures = PageFactory.initElements(driver, EdwardJonesHome.class);
        disclosures.setDisclosures();
    }
    @Test(priority = 6)
    public void edJonesCareers() throws InterruptedException{
        EdwardJonesHome careers = PageFactory.initElements(driver, EdwardJonesHome.class);
        careers.setCareers();
    }
    @Test(priority = 7)
    public void edJonesRetirementCalculator() throws InterruptedException{
        EdwardJonesHome retirement = PageFactory.initElements(driver, EdwardJonesHome.class);
        retirement.setRetirmentSavingsCalculator();
    }
    @Test(priority = 8)
    public void edJonesSavingsCalculator() throws InterruptedException{
        EdwardJonesHome savings = PageFactory.initElements(driver, EdwardJonesHome.class);
        savings.setSavingsCalculator();
    }
    @Test(priority = 9)
    public void edJonesLifeInsurance() throws InterruptedException{
        EdwardJonesHome lifeInsurance = PageFactory.initElements(driver, EdwardJonesHome.class);
        lifeInsurance.setLifeInsuranceCalculator();
    }
}

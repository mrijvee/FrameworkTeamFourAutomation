package testgeicopageobjects;

import base.CommonAPI;
import geicopageobjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    @Test
    public void testReportAClaim() throws InterruptedException {
        HomePage fileAReport = PageFactory.initElements(driver, HomePage.class);
        fileAReport.reportAClaim();
    }

    @Test
    public void testSetStartQuote() throws InterruptedException {
        HomePage retrieveQuote = PageFactory.initElements(driver, HomePage.class);
        retrieveQuote.setStartQuote("11417");
    }

    @Test
    public void testSetMakeAPayment() throws InterruptedException {
        HomePage makePayment = PageFactory.initElements(driver, HomePage.class);
        makePayment.setMakeAPayment();
    }

    @Test
    public void testRetrieveIDCard() throws InterruptedException {
        HomePage findIDCard = PageFactory.initElements(driver, HomePage.class);
        findIDCard.retrieveIDCard();
    }

    @Test
    public void testSetContactUs() throws InterruptedException {
        HomePage contactGeico = PageFactory.initElements(driver, HomePage.class);
        contactGeico.setContactUs();
    }

    @Test
    public void testSetSearch() throws InterruptedException {
        HomePage geicoSearch = PageFactory.initElements(driver, HomePage.class);
        geicoSearch.setSearch();
    }

    @Test
    public void testSetUpdateLocation() throws InterruptedException {
        HomePage locationUpdate = PageFactory.initElements(driver, HomePage.class);
        locationUpdate.setUpdateLocation();
    }

    @Test
    public void testSetProductsHover() throws InterruptedException {
        HomePage testProductsHover = PageFactory.initElements(driver, HomePage.class);
        testProductsHover.productsHover("vehicle insurance", "", "", "",
                "auto", "", "", "", "",
                "", "");
    }

    @Test
    public void testGeicoCareers() {
        HomePage testCareers = PageFactory.initElements(driver, HomePage.class);
        testCareers.geicoCareers();
    }

    @Test
    public void testInformationHover() throws InterruptedException {
        HomePage hoverInformation = PageFactory.initElements(driver, HomePage.class);
        hoverInformation.informationHover("", "save", "", "", "", "");
    }

    @Test
    public void testFindAnAgent() {
        HomePage locateAnAgent = PageFactory.initElements(driver, HomePage.class);
        try {
            locateAnAgent.setFindAnAgent("32-72 Steinway St", 25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddAVehicle() throws InterruptedException {
        HomePage addVehicle = PageFactory.initElements(driver, HomePage.class);
        addVehicle.setAddAVehicle("67589012", "11316");
    }

    @Test
    public void testRequestRoadSideHelp() throws InterruptedException {
        HomePage roadSideHelp = PageFactory.initElements(driver, HomePage.class);
        roadSideHelp.setRequestRoadSideHelp("Goku", "Son", "99807653214");
    }
}
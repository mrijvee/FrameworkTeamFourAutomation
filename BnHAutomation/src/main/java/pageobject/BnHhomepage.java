package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BnHhomepage extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='homePageCategiriesMain']/div/div[1]/a/div")
    public static WebElement clickPhotography;
    @FindBy(how = How.XPATH, using = ".//*[@id='Digital Cameras']/div")
    public static WebElement clickDigitalcameras;
    @FindBy(how = How.XPATH, using = ".//*[@id='Lenses']/div")
    public static WebElement clickLenses;
    @FindBy(how = How.XPATH, using = ".//*[@id='Drones   Aerial Imaging']/div")
    public static WebElement clickDrones;
    @FindBy(how = How.XPATH, using = ".//*[@id='Tripods   Support']/div")
    public static WebElement clickTripods;
    @FindBy(how = How.XPATH, using = ".//*[@id='Photography Bags   Cases']/div")
    public static WebElement clickBags;
    @FindBy(how = How.XPATH, using = ".//*[@id='Memory Cards   Accessories']/div")
    public static WebElement clickMemorycards;
    @FindBy(how = How.XPATH, using = ".//*[@id='Flashes   On Camera Lighting']/div")
    public static WebElement clickBatteries;
    @FindBy(how = How.XPATH, using = ".//*[@id='homePageCategiriesMain']/div/div[1]/a/div")
    public static WebElement clickFlashes;
    @FindBy(how = How.XPATH, using = ".//*[@id='homePageCategiriesMain']/div/div[1]/a/div")
    public static WebElement clickFilters;
    @FindBy(how = How.XPATH, using = ".//*[@id='homePageCategiriesMain']/div/div[2]/a/span")
    public static WebElement clickComputers;
    @FindBy(how = How.XPATH, using = ".//*[@id='Laptops']/div")
    public static WebElement clickLaptops;
    @FindBy(how = How.XPATH, using = ".//*[@id='iPads   Tablets']/div")
    public static WebElement clickIpads;
    @FindBy(how = How.XPATH, using = ".//*[@id='Desktops   Workstations']/div")
    public static WebElement clickDesktops;
    //    @FindBy(how= How.XPATH, using = ".//*[@id='homePageCategiriesMain']/div/div[1]/a/div")
//    public static WebElement clickPhotography;
    //    @FindBy(how= How.XPATH, using = ".//*[@id='homePageCategiriesMain']/div/div[1]/a/div")
//    public static WebElement clickPhotography;
    //    @FindBy(how= How.XPATH, using = ".//*[@id='homePageCategiriesMain']/div/div[1]/a/div")
//    public static WebElement clickPhotography;
    //    @FindBy(how= How.XPATH, using = ".//*[@id='homePageCategiriesMain']/div/div[1]/a/div")
//    public static WebElement clickPhotography;
    //    @FindBy(how= How.XPATH, using = ".//*[@id='homePageCategiriesMain']/div/div[1]/a/div")
//    public static WebElement clickPhotography;
    //    @FindBy(how= How.XPATH, using = ".//*[@id='homePageCategiriesMain']/div/div[1]/a/div")
//    public static WebElement clickPhotography;
    //    @FindBy(how= How.XPATH, using = ".//*[@id='homePageCategiriesMain']/div/div[1]/a/div")
//    public static WebElement clickPhotography;


    public void gotoPhotography() {
        clickPhotography.click();
    }

    public void choiceInPhotography(String Cameras, String Lenses, String Drones) throws InterruptedException {
        clickPhotography.click();
        if (Cameras.contains("Cameras")) {
            clickDigitalcameras.click();
        } else if (Lenses.contains("Lenses")) {
            clickLenses.click();
        } else if (Drones.contains("Drones")) {
            clickDrones.click();
        }
        Thread.sleep(3000);
    }

    public void accessories(String Tripods, String Bags, String Memory, String Batteries, String Flashes, String Filters) {
        clickPhotography.click();
        if (Tripods.contains("Tripods")) {
            clickTripods.click();
        } else if (Bags.contains("Bags")) {
            clickBags.click();
        } else if (Memory.contains("Memory")) {
            clickMemorycards.click();
        } else if (Batteries.contains("Batteries")) {
            clickBatteries.click();
        } else if (Flashes.contains("Flashes")) {
            clickFlashes.click();
        } else if (Filters.contains("Filters")) {
            clickFilters.click();
        }
    }

    public void choiceofComputers(String Laptops, String iPads, String Desktops) throws InterruptedException {
        clickComputers.click();
        if (Laptops.contains("Laptops")) {
            clickLaptops.click();
        } else if (iPads.contains("iPads")) {
            clickIpads.click();
        } else if (Desktops.contains("Desktops")) {
            clickDesktops.click();
        }
        Thread.sleep(3000);
    }
}

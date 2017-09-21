package testpageobject;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.BnHhomepage;

public class testBnHhomepage extends CommonAPI {
    //    @Test
//    public void gotoBestbuycart () throws InterruptedException {
//        BestbuyHomePage Bestbuycart = PageFactory.initElements(driver, BestbuyHomePage.class);
//        Bestbuycart.gotoBestbuyCart();
//    }
//    @Test
//    public void gotoPhotography () {
//        BnHhomepage clickphotography = PageFactory.initElements(driver, BnHhomepage.class);
//        clickphotography.gotoPhotography();
//    }
//    @Test (enabled = false)
//    public void buyIphoneX () throws InterruptedException {
//        BestbuyHomePage buyiphonex = PageFactory.initElements(driver, BestbuyHomePage.class);
//        buyiphonex.iphoneX("Verizon", "", "");
//    }

    @Test (enabled = false)
    public void choiceofPhotography () throws InterruptedException {
        BnHhomepage choicesPhotography = PageFactory.initElements(driver, BnHhomepage.class);
        choicesPhotography.choiceInPhotography("Cameras", "", "");
    }
    @Test
    public void optionsForAccessories (){
        BnHhomepage optionsAcessories = PageFactory.initElements(driver, BnHhomepage.class);
        optionsAcessories.accessories("Tripods", "", "", "", "","");
    }
    @Test
    public void choiceOfcomputers () throws InterruptedException {
        BnHhomepage choicesComputers = PageFactory.initElements(driver, BnHhomepage.class);
        choicesComputers.choiceofComputers("Laptops", "", "");
    }
}

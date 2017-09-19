package PageObject;


import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

//    @Test
//    public void testMenuButton(){
//        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//        homePage.MenuBar();
//    }
    @Test
    public void testSignUp() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.MenuBar();

    }

}
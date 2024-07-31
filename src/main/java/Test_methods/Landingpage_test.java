package Test_methods;

import Page_objects.Landingpage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Landingpage_test extends Landingpage {



    @BeforeMethod
    public void beforeMethod() throws IOException {
        launch_browser("https://magento.softwaretestingboard.com/");
    }

    @AfterMethod
    public void afterMethod() {
        close_browser();
    }

    @Test
    public void landing_001() {
        shop_yoga();
    }

    @Test
    public void landing_002() {
        shop_pants();
    }

    @Test
    public void landing_003() {
        shop_tees();
    }



}

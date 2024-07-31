package Test_methods;

import org.testng.annotations.Test;
import Page_objects.Homepage;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class Homepage_test extends Homepage {

    @Test
    public void Homepage_001() {
        Whatsnew();
    }

    @Test
    public void Homepage_002() {
        women_tab();
    }

    @Test
    public void Homepage_003() {
        men_tab();
    }

    @Test
    public void Homepage_004() {
        gear_tab();
    }

    @Test
    public void Homepage_005() {
        training_tab();
    }

    @Test
    public void Homepage_006() {
        sale_tab();
    }

    @Test
    public void Homepage_007() {
        Verify_empty_cart();
    }

    @Test
    public void Homepage_008() {
        verify_Searchbox();
    }


    @BeforeMethod
    public void beforeMethod() throws IOException {
        if (driver == null) {
            launch_browser("https://magento.softwaretestingboard.com/");
        }
    }

    @AfterMethod
    public void afterMethod() {

        close_browser();
    }

}

package Test_methods;

import org.testng.annotations.Test;
import Page_objects.Womenspage;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.testng.annotations.AfterMethod;

public class Womenpage_test extends Womenspage {
    @Test
    public void Womentab_001() {
        Verify_women_subtab();
    }

    @Test
    public void Womentab_002() {
        verify_women_top_tab();
    }

    @Test
    public void Womentab_003() {

        vrfy_item_in_toptab();
    }

    @Test
    public void Womentab_004() {
        additem_tocart();
    }


    @BeforeMethod
    public void beforeMethod() throws IOException {

        launch_browser("https://magento.softwaretestingboard.com/");
    }

    @AfterMethod
    public void afterMethod() {
        close_browser();
    }

}

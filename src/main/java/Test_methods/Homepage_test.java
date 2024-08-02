package Test_methods;

import org.testng.annotations.Test;
import Page_objects.Homepage;

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


}

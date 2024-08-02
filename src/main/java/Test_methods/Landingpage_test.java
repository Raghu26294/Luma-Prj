package Test_methods;

import Page_objects.Landingpage;
import org.testng.annotations.Test;


public class Landingpage_test extends Landingpage {


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

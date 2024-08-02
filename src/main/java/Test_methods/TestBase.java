package Test_methods;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import Utilities.Base;


public class TestBase {

    @BeforeSuite
    public void setUp() {
        Base.launch_browser("https://magento.softwaretestingboard.com/");
    }

    @AfterSuite
    public void tearDown() {
        Base.close_browser();
    }
}
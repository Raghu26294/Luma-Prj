package Test_methods;

import java.io.IOException;
import org.testng.annotations.*;
import Page_objects.Createaccount;


public class Createaccount_test extends Createaccount {


    @BeforeMethod
    public void browser_launch() throws IOException {
        launch_browser("https://magento.softwaretestingboard.com/");
        createaccountpage();
    }


    @AfterMethod
    public void afterMethod() {
        close_browser();
    }


    @Test
    public void Createaccount_001() {

        firstname();
    }

    @Test
    public void Createaccount_002() {

        lastname();
    }

    @Test
    public void Createaccount_003() {

        emailaddresstest();
    }

    @Test
    public void Createaccount_004() {

        passwordtest();
    }

     @Test
    public void Createaccount_005() {

        confirmpasswordtest();
    }

    //@Test
    //creating account in the website by providing all details
    public void Createaccount_006() {
         createaccount();
    }

    @Test
    public void Createaccount_007() {
        existingaccount();
    }


}

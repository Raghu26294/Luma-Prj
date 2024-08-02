package Test_methods;


import org.testng.annotations.*;
import Page_objects.Createaccount;


public class Createaccount_test extends Createaccount {


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


    //creating account in the website by providing all details
    @Test
    public void Createaccount_006() {

        existingaccount();
    }


    @Test
    public void Createaccount_007() {
        createaccount();
    }


}

package Test_methods;

import org.testng.annotations.Test;

import Page_objects.Signin_page;

public class Signin_test extends Signin_page {


    @Test
    public void signin_001() {
        signin_values();
    }

    @Test
    public void signin_002() {
        invalid_signinvalue();
    }

    @Test
    public void signin_003() {
        forgot_pwd();
    }

}

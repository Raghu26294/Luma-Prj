package Test_methods;

import org.testng.annotations.Test;

import Page_objects.Signin_page;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class Signin_test extends Signin_page {

    @BeforeMethod
    public void beforeMethod() throws IOException {
        launch_browser("https://magento.softwaretestingboard.com/");
    }

    @AfterMethod
    public void afterMethod() {
        close_browser();
    }

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

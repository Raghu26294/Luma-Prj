package Page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Signin_page extends Base {

    By signin_home = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
    By email = By.xpath("//*[@id='email']");
    By pwd = By.xpath("//*[@id='pass']");
    By signin = By.xpath("//*[@id='send2']/span");
    By fgt_pwd_btn = By.xpath("//*[@id='login-form']/fieldset/div[4]/div[2]/a/span");
    By fgt_pgtitle = By.xpath("//*[@id='maincontent']/div[1]/h1/span");
    By fgt_email = By.xpath("//*[@id='email_address']");
    By reset_pwd = By.xpath("//*[@id='form-validate']/div/div[1]/button/span");
    By resetpwd_msg = By.xpath("//*[@id='maincontent']/div[2]/div[2]/div/div/div");
    By invalid_login = By.xpath("//*[@id='maincontent']/div[2]/div[2]/div/div/div");
    By afterloggin_page = By.cssSelector("span.logged-in");

    public void enterEmailadd(String emailadd) {
        WebElement emaila = driver.findElement(email);
        emaila.sendKeys(emailadd);
    }

    public void enterPassword(String passwordcheck) {
        WebElement pass = driver.findElement(pwd);
        pass.sendKeys(passwordcheck);
    }


    public void signin_values() {
        driver.findElement(signin_home).click();
        enterEmailadd(read_excel(9, 2));
        enterPassword(read_excel(10, 2));
        driver.findElement(signin).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actual = driver.findElement(afterloggin_page).getText();
        String expected = read_excel(10, 1);
        System.out.println("Actual : " + actual);
        System.out.println("Expected : " + expected);
        Assert.assertEquals(actual, expected, "After login page message mismatch");
    }

    public void invalid_signinvalue() {

        driver.findElement(signin_home).click();
        enterEmailadd(read_excel(12, 2));
        enterPassword(read_excel(13, 2));
        driver.findElement(signin).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actual = driver.findElement(invalid_login).getText();
        String expected = read_excel(12, 1);
        System.out.println("Actual error message : " + actual);
        System.out.println("Expected error message: " + expected);
        Assert.assertEquals(actual, expected, "Invalid login error msg mismatch");
    }

    public void forgot_pwd() {
        driver.findElement(signin_home).click();
        driver.findElement(fgt_pwd_btn).click();
        String actual = driver.findElement(fgt_pgtitle).getText();
        String expected = read_excel(16, 2);
        Assert.assertEquals(actual, expected, "Invalid login error msg mismatch");
        driver.findElement(fgt_email).sendKeys(read_excel(15, 2));
        driver.findElement(reset_pwd).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actualmessage = driver.findElement(resetpwd_msg).getText();
        System.out.println("msg to reset password : " + actualmessage);
    }

}

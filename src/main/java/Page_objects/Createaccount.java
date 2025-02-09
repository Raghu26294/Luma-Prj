package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import Utilities.Base;
import org.testng.Assert;


public class Createaccount extends Base {


    By createaccount = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
    By Page_title = By.xpath("//*[@id='maincontent']/div[1]/h1/span");
    By Frst_name = By.xpath("//*[@id='firstname']");
    By lst_name = By.xpath("//*[@id='lastname']");
    By email = By.xpath("//*[@id='email_address']");
    By Password = By.xpath("//*[@id='password']");
    By cnfm_pwd = By.xpath("//*[@id='password-confirmation']");
    By Crt_button = By.xpath("//*[@id='form-validate']/div/div[1]/button/span");
    By acc_crt_msg = By.xpath("//*[@id='maincontent']/div[1]/div[2]/div/div/div");
    By First_name_err = By.xpath("//*[@id='firstname-error']");
    By Last_name_err = By.xpath("//*[@id='lastname-error']");
    By Email_add_err = By.xpath("//*[@id='email_address-error']");
    By Pass_err = By.xpath("//*[@id='password-error']");
    By Pass_con_err = By.xpath("//*[@id='password-confirmation-error']");
    By acc_cre_err = By.xpath("//*[@id='maincontent']/div[2]/div[2]/div/div/div");

    public void enterFirstName(String firstname) {
        WebElement firname = driver.findElement(Frst_name);
        firname.sendKeys(firstname);
    }

    public void enterLastName(String lastName) {
        WebElement lastname = driver.findElement(lst_name);
        lastname.sendKeys(lastName);
    }

    public void enterEmailadd(String emailadd) {
        WebElement emaila = driver.findElement(email);
        emaila.sendKeys(emailadd);
    }

    public void enterPassword(String passwordcheck) {
        WebElement pass = driver.findElement(Password);
        pass.sendKeys(passwordcheck);
    }

    public void enterconfirmpass(String confirmpass) {
        WebElement conpass = driver.findElement(cnfm_pwd);
        conpass.sendKeys(confirmpass);
    }


    public void createaccountpage() {
        WebElement Createaccountpage = driver.findElement(createaccount);
        Createaccountpage.click();
        WebElement Pagetitle = driver.findElement(Page_title);
        String ActualPagetitle = Pagetitle.getText();
        String ExpectedPagetitle = read_excel(1, 2);
        Assert.assertEquals(ActualPagetitle, ExpectedPagetitle, "Page title not matched");
    }

    public void firstname() {
        createaccountpage();
        enterLastName(read_excel(3, 2));
        enterEmailadd(read_excel(4, 2));
        enterPassword(read_excel(5, 2));
        enterconfirmpass(read_excel(6, 2));
        driver.findElement(Crt_button).click();
        String actualError = driver.findElement(First_name_err).getText();
        String expectedError = read_excel(7, 2);
        System.out.println("Actual First Name Error: " + actualError+ " and Expected First Name Error " + expectedError);
        Assert.assertEquals(actualError, expectedError, "First name error message mismatch");
    }

    public void lastname() {
        createaccountpage();
        enterFirstName(read_excel(2, 2));
        enterEmailadd(read_excel(4, 2));
        enterPassword(read_excel(5, 2));
        enterconfirmpass(read_excel(6, 2));
        driver.findElement(Crt_button).click();
        String actualError = driver.findElement(Last_name_err).getText();
        String expectedError = read_excel(7, 2);
        System.out.println("Actual Last Name Error: " + actualError + " and Expected Last Name Error"  +expectedError);
        Assert.assertEquals(actualError, expectedError, "Last name error message mismatch");
    }

    public void emailaddresstest() {
        createaccountpage();
        enterFirstName(read_excel(2, 2));
        enterLastName(read_excel(3, 2));
        enterPassword(read_excel(5, 2));
        enterconfirmpass(read_excel(6, 2));
        driver.findElement(Crt_button).click();
        String actualError = driver.findElement(Email_add_err).getText();
        String expectedError = read_excel(7, 2);
        System.out.println("Actual Email Error: " + actualError + " and Expected Email  Error"  +expectedError);
        Assert.assertEquals(actualError, expectedError, "Email address error message mismatch");
    }

    public void passwordtest() {
        createaccountpage();
        enterFirstName(read_excel(2, 2));
        enterLastName(read_excel(3, 2));
        enterEmailadd(read_excel(4, 2));
        enterconfirmpass(read_excel(6, 2));
        driver.findElement(Crt_button).click();
        String actualError = driver.findElement(Pass_err).getText();
        String expectedError = read_excel(7, 2);
        System.out.println("Actual Password Error: " + actualError + " and Expected Password Error"  +expectedError);
        Assert.assertEquals(actualError, expectedError, "Password error message mismatch");
    }

    public void confirmpasswordtest() {
        createaccountpage();
        enterFirstName(read_excel(2, 2));
        enterLastName(read_excel(3, 2));
        enterEmailadd(read_excel(4, 2));
        enterPassword(read_excel(5, 2));
        driver.findElement(Crt_button).click();
        String actualError = driver.findElement(Pass_con_err).getText();
        String expectedError = read_excel(7, 2);
        System.out.println("Actual Confirm password Error: " + actualError + " and Expected Confirm Password Error"  +expectedError);
        Assert.assertEquals(actualError, expectedError, "Password confirmation error message mismatch");
    }

    public void createaccount() {
        createaccountpage();
        enterFirstName(read_excel(2, 2));
        enterLastName(read_excel(3, 2));
        enterEmailadd(read_excel(4, 2));
        enterPassword(read_excel(5, 2));
        enterconfirmpass(read_excel(6, 2));
        driver.findElement(Crt_button).click();
        timeout(10);
        String accountcreatemsg = driver.findElement(acc_crt_msg).getText();
        System.out.println("Account Created: " + accountcreatemsg);
    }


    public void existingaccount()  {
        timeout(5);
        launch_browser("https://magento.softwaretestingboard.com/");
        createaccountpage();
        enterFirstName(read_excel(2, 2));
        enterLastName(read_excel(3, 2));
        enterEmailadd(read_excel(9, 2));
        enterPassword(read_excel(5, 2));
        enterconfirmpass(read_excel(6, 2));
        driver.findElement(Crt_button).click();
        String actualError = driver.findElement(acc_cre_err).getText();
        String expectedError = read_excel(8, 2);
        System.out.println("Actual Account exists Error: " + actualError + " and Expected Account exists Error"  +expectedError);
        Assert.assertEquals(actualError, expectedError, "account already exists error");
    }
}
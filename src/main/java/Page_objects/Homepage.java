package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import org.testng.Assert;

public class Homepage extends Base {

    By Whatsnew_tab = By.xpath("//*[@id='ui-id-3']");
    By women_tab = By.xpath("//a[span[text()='Women']]");
    By men_tab = By.xpath("//a[span[text()='Men']]");
    By gear_tab = By.xpath("//a[span[text()='Gear']]");
    By training_tab = By.xpath("//a[span[text()='Training']]");
    By sale_tab = By.xpath("//a[span[text()='Sale']]");
    By page_title = By.xpath("//*[@id='page-title-heading']/span");
    By cart_btn = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
    By cart_msg = By.xpath("//*[@id='minicart-content-wrapper']/div[2]/strong");

    By searchbox = By.xpath("//*[@id='search']");
    By search_rslt_pgtitle = By.xpath("//*[@id='maincontent']/div[1]/h1/span");


    public void Whatsnew() {
        driver.findElement(Whatsnew_tab).click();
        String Actual_title = driver.findElement(page_title).getText();
        String expected_title = read_excel(18, 2);
        System.out.println("Actual_title : " + Actual_title + " and expected_title : " + expected_title);
        Assert.assertEquals(Actual_title, expected_title, "Title mismatch found");
    }

    public void women_tab() {
        driver.findElement(women_tab).click();
        String Actual_title = driver.findElement(page_title).getText();
        String expected_title = read_excel(19, 2);
        System.out.println("Actual_title : " + Actual_title + " and expected_title : " + expected_title);
        Assert.assertEquals(Actual_title, expected_title, "Title mismatch found");
    }

    public void men_tab() {
        driver.findElement(men_tab).click();
        String Actual_title = driver.findElement(page_title).getText();
        String expected_title = read_excel(20, 2);
        System.out.println("Actual_title : " + Actual_title + " and expected_title : " + expected_title);
        Assert.assertEquals(Actual_title, expected_title, "Title mismatch found");
    }

    public void gear_tab() {
        driver.findElement(gear_tab).click();
        String Actual_title = driver.findElement(page_title).getText();
        String expected_title = read_excel(21, 2);
        System.out.println("Actual_title : " + Actual_title + " and expected_title : " + expected_title);
        Assert.assertEquals(Actual_title, expected_title, "Title mismatch found");
    }

    public void training_tab() {
        driver.findElement(training_tab).click();
        String Actual_title = driver.findElement(page_title).getText();
        String expected_title = read_excel(22, 2);
        System.out.println("Actual_title : " + Actual_title + " and expected_title : " + expected_title);
        Assert.assertEquals(Actual_title, expected_title, "Title mismatch found");
    }

    public void sale_tab() {
        driver.findElement(sale_tab).click();
        String Actual_title = driver.findElement(page_title).getText();
        String expected_title = read_excel(23, 2);
        System.out.println("Actual_title : " + Actual_title + " and expected_title : " + expected_title);
        Assert.assertEquals(Actual_title, expected_title, "Title mismatch found");
    }


    public void Verify_empty_cart() {
        driver.findElement(cart_btn).click();
        String Actual_title = driver.findElement(cart_msg).getText();
        String expected_title = read_excel(24, 2);
        System.out.println("Actual_title : " + Actual_title + " and expected_title : " + expected_title);
        Assert.assertEquals(Actual_title, expected_title, "Title mismatch found");
    }


    public void verify_Searchbox() {

        driver.findElement(searchbox).sendKeys((read_excel(25, 2)));
        Actions builder1 = new Actions(driver);
        builder1
                .keyDown(Keys.ENTER)
                .keyUp(Keys.ENTER)
                .build().perform();
        String Actual_title = driver.findElement(search_rslt_pgtitle).getText();
        String expected_title = read_excel(26, 2);
        System.out.println("Actual_title : " + Actual_title + " and expected_title : " + expected_title);
        Assert.assertEquals(Actual_title, expected_title, "Title mismatch found");


    }


}

package Page_objects;

import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;


public class Landingpage extends Base {


    By yoga_button = By.xpath("//*[@id='maincontent']/div[3]/div/div[2]/div[1]/a/span/span[2]");
    By pants_button = By.xpath("//*[@id='maincontent']/div[3]/div/div[2]/div[1]/div/a[1]/span/span[2]");
    By tees_button = By.xpath("//*[@id='maincontent']/div[3]/div/div[2]/div[1]/div/a[2]/span[2]/span[2]");
    By page_title = By.xpath("//*[@id='page-title-heading']/span");


    public void shop_yoga() {
        launch_browser("https://magento.softwaretestingboard.com/");
        driver.findElement(yoga_button).click();
        String Actual_title = driver.findElement(page_title).getText();
        String expected_title = read_excel(27, 2);
        System.out.println("Actual_title : " + Actual_title +  " expected_title : " + expected_title);
        Assert.assertEquals(Actual_title, expected_title, "Title mismatch found");
    }


    public void shop_pants() {
        timeout(5);
        launch_browser("https://magento.softwaretestingboard.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200);");
        driver.findElement(pants_button).click();
        String Actual_title = driver.findElement(page_title).getText();
        String expected_title = read_excel(28, 2);
        System.out.println("Actual_title : " + Actual_title +  " expected_title : " + expected_title);
        Assert.assertEquals(Actual_title, expected_title, "Title mismatch found");

    }

    public void shop_tees() {
        timeout(5);
        launch_browser("https://magento.softwaretestingboard.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200);");
        driver.findElement(tees_button).click();
        timeout(10);
        String Actual_title = driver.findElement(page_title).getText();
        String expected_title = read_excel(29, 2);
        System.out.println("Actual_title : " + Actual_title +  " expected_title : " + expected_title);
        Assert.assertEquals(Actual_title, expected_title, "Title mismatch found");
    }
}

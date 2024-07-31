package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilities.Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Womenspage extends Base {
	
	By women_tab = By.xpath("//*[@id='ui-id-4']/span[2]");
	By tops = By.xpath("//*[@id='narrow-by-list2']/dd/ol/li[1]/a");
	By tops_count = By.xpath("//*[@id='narrow-by-list2']/dd/ol/li[1]/span");
	By tops_pgtitle = By.xpath("//*[@id='page-title-heading']/span");
	By Bottoms = By.xpath("//*[@id='narrow-by-list2']/dd/ol/li[2]/a");
	By Bottoms_count =By.xpath("//*[@id='narrow-by-list2']/dd/ol/li[2]/span");

	By top_select = By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img");
    By top_title = By.xpath("//*[@id='maincontent']/div[2]/div/div[1]/div[1]/h1/span");

	By size_button = By.xpath("//*[@id='option-label-size-143-item-169']");
	By colour_btn = By.xpath("//*[@id='option-label-color-93-item-50']");
	By Addtocart = By.xpath("//*[@id='product-addtocart-button']");
    By Success_msg =By.xpath("//*[@id='maincontent']/div[1]/div[2]/div/div/div");

	By item1title =By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[4]/ol/li[1]/div/div/strong");
	By top_item1 = By.xpath("//*[@id=\'maincontent\']/div[3]/div[1]/div[4]/ol/li[1]/div/div/strong/a");
	By item1_title = By.xpath("//*[@id=\'maincontent\']/div[2]/div/div[2]/div[1]/h1/span");
	By item_1_price = By.xpath("//*[@id=\'product-price-724\']/span");
	By cartbtn =By.xpath("//a[@class='action showcart']");
	By itemprice_incart =By.xpath("//*[@id=\'mini-cart\']/li/div/div/div[2]/div[1]/span/span");

	public void timeout(int seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public void Verify_women_subtab() {
		timeout(10);
		driver.findElement(women_tab).click();
		String Actual_tops_count= driver.findElement(tops_count).getText();
		String expected_tops_count = read_excel(30, 2);
		System.out.println("Actual Count is "+ Actual_tops_count + " and Expected Count is "+ expected_tops_count );
		Assert.assertEquals(Actual_tops_count, expected_tops_count, "Count mismatch");

		String Actual_Bottoms_count= driver.findElement(Bottoms_count).getText();
		String expected_Bottoms_count = read_excel(31, 2);
		System.out.println("Actual Count is: "+ Actual_Bottoms_count + " and Expected Count is: "+expected_Bottoms_count);
		Assert.assertEquals(Actual_Bottoms_count, expected_Bottoms_count, "Count mismatch");
	}
	
	public void verify_women_top_tab() {
		timeout(10);
		driver.findElement(women_tab).click();
		driver.findElement(tops).click();
		String Actual_page_title =driver.findElement(tops_pgtitle).getText();
		String Expected_page_title = read_excel(32, 2);
		System.out.println("Actual title: "+ Actual_page_title + " and Expected title: "+Expected_page_title);
		Assert.assertEquals(Actual_page_title, Expected_page_title, "Title mismatch");

	}
	
	public void vrfy_item_in_toptab() {
		timeout(10);
		driver.findElement(women_tab).click();
		driver.findElement(tops).click();
		driver.findElement(top_select).click();

		String Actual_page_title =driver.findElement(top_title).getText();
		String Expected_page_title = read_excel(33, 2);
		System.out.println("Actual title: "+ Actual_page_title + " and Expected title: "+Expected_page_title);
		Assert.assertEquals(Actual_page_title, Expected_page_title, "Title mismatch");
	}
	
	public void additem_tocart() {
		timeout(10);
		driver.findElement(women_tab).click();
		driver.findElement(tops).click();
		driver.findElement(top_select).click();
		timeout(10);
		driver.findElement(size_button).click();
		driver.findElement(colour_btn).click();
		driver.findElement(Addtocart).click();
		timeout(15);
		String Actual_success_msg = driver.findElement(Success_msg).getText();
		String Expected_success_msg = read_excel(34, 2);
		System.out.println("Actual success_msg: "+ Actual_success_msg + " and Expected success msg: "+Expected_success_msg);
		Assert.assertEquals(Actual_success_msg, Expected_success_msg, "Title mismatch");
	}

}

package Utilities;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Base extends excel_testdata {

    static public WebDriver driver;


    public static void launch_browser(String url) throws IOException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");// For low-memory environments
        //options.addArguments("--headless"); // Uncomment if you want to run headless
        options.addArguments("--incognito");
        //System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
        //System.setProperty("webdriver.chrome.verboseLogging", "true");


        // Initialize ChromeDriver with ChromeOptions
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().deleteAllCookies();
        //driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().window().maximize();
    }

    public static void close_browser() {
        driver.close();
        driver.quit();
    }


}

package Utilities;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Base extends excel_testdata {

    static public WebDriver driver;


    public static void launch_browser(String url) {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-gpu");
            //options.addArguments("--no-sandbox");
            //options.addArguments("--disable-dev-shm-usage");// For low-memory environments
            //options.addArguments("--headless"); // Uncomment if you want to run headless
            //options.addArguments("--incognito");
            //System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
            //System.setProperty("webdriver.chrome.verboseLogging", "true");


            // Initialize ChromeDriver with ChromeOptions
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        driver.get(url);
        driver.manage().deleteAllCookies();
    }

    public static void close_browser() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver has been quit.");
            driver = null;
        }
    }

    public static void timeout(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
}

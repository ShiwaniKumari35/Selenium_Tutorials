package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestListener {
    public static WebDriver driver=null;

    @BeforeSuite
    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void closingBrowser(){
        driver.close();

    }
}

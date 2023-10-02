package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingMouseHover {
    public static WebDriver driver;
    public static String browser = "Chrome";

    public static void main(String[] args) throws InterruptedException {
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://www.ebay.com.au/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        Thread.sleep(2000);

        driver.close();

    }
}

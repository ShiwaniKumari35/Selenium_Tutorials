package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class PrintingAllLinks {
    public static WebDriver driver;
    public static String browser= "Chrome";
    public static void main(String[] args)throws InterruptedException {
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://www.sugarcrm.com");
        driver.manage().window().maximize();

        List<WebElement> alltags = driver.findElements(By.tagName("a"));
        System.out.println("Total tags are : " + alltags.size());

        for (int i=0; i<alltags.size();i++){
            System.out.println("Links on the page : " + alltags.get(i).getAttribute("href"));
            System.out.println("Links on the page : " + alltags.get(i).getText());

        }
        driver.close();
    }
}

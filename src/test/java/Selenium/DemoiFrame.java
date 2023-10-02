package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoiFrame {
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

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();
        //driver.switchTo().frame(0);
        //driver.switchTo().frame("iframeResult");
        WebElement frame1 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/button")).click();

        //driver.switchTo().parentFrame();
        //Thread.sleep(2000);
        //System.out.println(driver.getTitle());
        //driver.close();

    }
}

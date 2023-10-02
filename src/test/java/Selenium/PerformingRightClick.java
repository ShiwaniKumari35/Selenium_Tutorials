package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingRightClick {
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

        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //switching from one frame to another
        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);
        Thread.sleep(1000);

        WebElement rectangle = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));

        Actions action = new Actions(driver);
        action.contextClick(rectangle).perform();
        Thread.sleep(2000);



        driver.close();

    }
}

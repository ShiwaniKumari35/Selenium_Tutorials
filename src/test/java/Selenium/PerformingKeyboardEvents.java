package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingKeyboardEvents {
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

        driver.get("https://extendsclass.com/text-compare.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement SourceTextArea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/div[4]/pre"));

        Actions action = new Actions(driver);
        //This below line of code will first select all the text and copy the text
        action.keyDown(SourceTextArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        Thread.sleep(2000);

        WebElement DestinationTextArea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[4]/pre"));
        action.keyDown(DestinationTextArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
        Thread.sleep(1000);

        driver.close();

    }
}

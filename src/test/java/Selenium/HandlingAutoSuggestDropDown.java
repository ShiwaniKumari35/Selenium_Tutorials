package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingAutoSuggestDropDown {
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

        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='From']")).click();
        // we can use either this way for less hard code
        WebElement from = driver.findElement(By.xpath("//input[@placeholder ='From']"));
        Thread.sleep(2000);
        from.sendKeys("Sydney");
        Thread.sleep(2000);
        from.sendKeys(Keys.ARROW_DOWN );
        Thread.sleep(2000);
        from.sendKeys(Keys.ENTER );
        Thread.sleep(2000);

        //or else we can use this as well for more understanding
        /* driver.findElement(By.xpath("//input[@placeholder ='From']")).sendKeys("Sydney");
        driver.findElement(By.xpath("//input[@placeholder ='From']")).sendKeys(Keys.ARROW_DOWN );
        driver.findElement(By.xpath("//input[@placeholder ='From']")).sendKeys(Keys.ENTER );

*/
        driver.close();
    }
}
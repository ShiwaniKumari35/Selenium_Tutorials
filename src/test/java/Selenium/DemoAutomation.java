package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
    public static void main (String[] args) throws InterruptedException{
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();
       driver.get("http://www.google.com");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium Tutorial");
       driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
       Thread.sleep(1000);
       driver.close();
    }
}

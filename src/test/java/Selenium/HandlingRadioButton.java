package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HandlingRadioButton {
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

        //WebElement radio1 = driver.findElement(By.id("bookFlights"));
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[2]")).click();
        //radio2.click();
      //  System.out.println("Is radio button is selected : " +  radio1.isSelected());
      //  System.out.println("Is radio button is selected : " +  radio2.isSelected());

        Thread.sleep(1000);
        driver.navigate().to("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
        driver.manage().window().maximize();
        System.out.println("Number of Radio buttons are " + driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());
        driver.close();




    }
}

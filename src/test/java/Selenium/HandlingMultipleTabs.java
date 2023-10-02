package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandlingMultipleTabs {
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

        driver.get("https://www.salesforce.com/au/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
        Thread.sleep(2000);

        Set<String> Windowshandles = driver.getWindowHandles();
        System.out.println(Windowshandles);

        Iterator<String> iterator = Windowshandles.iterator();
        String ParentWindow = iterator.next();
        System.out.println("Current Tab Name is : " + ParentWindow);
        String ChildWindow = iterator.next();
        System.out.println("Next Tab Name is : "  + ChildWindow);
        driver.switchTo().window(ChildWindow);


        driver.findElement(By.name("UserFirstName")).sendKeys("Shiwani");
        driver.findElement(By.name("UserLastName")).sendKeys("Mathuri");

        //driver.switchTo().window(ParentWindow);

        driver.close();


    }
}

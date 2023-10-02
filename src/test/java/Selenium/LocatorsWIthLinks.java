package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsWIthLinks {
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
        driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //linkText() is used to locates anchor elements whose visible text matches the search value
        //driver.findElement(By.linkText("Actions API")).click(); //using the linktext locator and got the actions api from the <a href span> word

        //partialLinkText() is used to locates anchor elements whose visible text contains the search value.If multiple matching then only the first one will be selected
        driver.findElement(By.partialLinkText("Actions")).click(); //just taking one word for partial link text
        Thread.sleep(3000);
        driver.close();
}
}

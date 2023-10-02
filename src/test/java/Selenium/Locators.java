package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {
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
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //id() is used to locates elements whose ID attributes matches the search value
        //driver.findElement(By.id("user-name")).sendKeys("Shiwani"); //using id locators

        //name() is used to locates the elements whose name attribute matches the search value
        //driver.findElement(By.name("user-name")).sendKeys("Shiwani"); //using name locator

        //cssSelector() is used to locates elements matches a css selector
        //driver.findElement(By.cssSelector("#user-name")).sendKeys("Shiwani"); //using css selector locator

        //xpath() is used to locates elements matching an xpath expressions
        //If xpath starts with single slash(/) then it is a absolute xpath and if xpath starts with double slash(//) then it is relative xpath
        // driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Shiwani"); //using xpath locator

        //tagName() is used to locates elements whose tagName matches the search value
        driver.findElement(By.tagName("input")).sendKeys("Shiwani"); //using tag locator
        driver.close();
    }
}

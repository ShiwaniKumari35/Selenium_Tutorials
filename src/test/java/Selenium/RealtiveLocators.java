package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RealtiveLocators {
    //relative locators is previously known as friendly locators
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
        driver.get("https://demo.guru99.com/V4/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.name("password"));
        WebElement username = driver.findElement(By.name("uid"));
        WebElement submit_button = driver.findElement(By.name("btnLogin"));
        WebElement reset_button = driver.findElement(By.name("btnReset"));

        //above() locators is used to returns the WebElements which appear above of the specified element
      //  driver.findElement(withTagName("input").above(password)).sendKeys("mngr491858");

        //below() locator is used to return the WebElements which appears below of the specified element
      //  driver.findElement(withTagName("input").below(username)).sendKeys("ehAjEha");

        //toLeftOf() locator is used to return the WebElements which appears to left of the specified element
      //  driver.findElement(withTagName("input").toLeftOf(reset_button)).click();

        //toRightOf() locator is used to return the WebElements which appears to right of the specified element
         //driver.findElement(withTagName("input").toRightOf(submit_button)).click();

        //near() locator returns the WebElements which is almost 50px away from the specified element
        //driver.findElement(withTagName("input").near(submit_button)).click();

        Thread.sleep(2000);
        driver.close();

    }
}

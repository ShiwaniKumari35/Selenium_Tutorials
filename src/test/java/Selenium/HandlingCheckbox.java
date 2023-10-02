package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingCheckbox {
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

        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        driver.manage().window().maximize();

        //Using this method we can scroll down if the checkbox/ radio button is in bottom of the page
       /* WebElement checkbox =  driver.findElement(By.xpath("//*[@id=\"signup_form_C4f9\"]/div[5]/div/div/div[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(checkbox);
        actions.perform();*/

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[5]/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[5]/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.close();


    }
}

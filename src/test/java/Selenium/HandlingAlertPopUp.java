package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingAlertPopUp {
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

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();
        WebElement frame1 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/button")).click();

        Thread.sleep(1000);

        //getText() is used to display the text of the alert message
        String alertText = driver.switchTo().alert().getText();
        System.out.println(" The Alert popup Text is : " + alertText);
        Thread.sleep(1000);

        //accept() is used to accept the alert
        driver.switchTo().alert().accept();

        //dismiss()- it will not accept the alert
        //driver.switchTo().alert().dismiss();
        Thread.sleep(1000);

        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        //driver.close();
    }
}

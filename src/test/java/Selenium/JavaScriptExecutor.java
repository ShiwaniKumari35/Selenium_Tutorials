package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor {
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

        JavascriptExecutor jsexec = (JavascriptExecutor) driver;

        //this code will print the title
        //Javascript ends with semicolon so we are using semicolon in double quotes
        String script = " return document.title; ";
        String title = (String) jsexec.executeScript(script);
        System.out.println("The title is : " + title);

        //To click the button
        driver.switchTo().frame("iframeResult");
        jsexec.executeScript("myFunction()");
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        //highlight the button
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("/html/body/button"));
        Thread.sleep(2000);
        jsexec.executeScript("arguments[0].style.border='3px solid green'", button);

        //scroll the page
        Thread.sleep(2000);
        driver.navigate().to("https://www.w3schools.com/");
        Thread.sleep(2000);
        WebElement getStartedButton = driver.findElement(By.xpath("//*[@id=\"getdiploma\"]/a"));
        Thread.sleep(2000);
        jsexec.executeScript("arguments[0].scrollIntoView(true);", getStartedButton);

        driver.close();
        
    }
}

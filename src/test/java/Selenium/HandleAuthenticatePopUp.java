package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAuthenticatePopUp {
    public static WebDriver driver;
    public static String browser= "Chrome";
    public static String username = "admin";
    public static String password = "admin";
    public static void main(String[] args)throws InterruptedException {
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        //The one way to handle authentication popup by adding username and password in the url itself
        //driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


        //The another way is to initialize the username and password in string and append in the url
        driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();

        driver.close();
    }
}

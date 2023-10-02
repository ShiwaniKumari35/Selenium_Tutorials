package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class handlingSSLErrors {
    public static WebDriver driver;
    public static String browser = "Chrome";

    public static void main(String[] args) throws InterruptedException, IOException {
        DesiredCapabilities handleSSLError = new DesiredCapabilities();
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            handleSSLError = new DesiredCapabilities();
            handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
            ChromeOptions choptions = new ChromeOptions();
            choptions.merge(handleSSLError);
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            handleSSLError = new DesiredCapabilities();
            handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
            EdgeOptions edoptions = new EdgeOptions();
            edoptions.merge(handleSSLError);
            driver = new EdgeDriver();
        }

        driver.get("https://expired.badssl.com/");
    }
}

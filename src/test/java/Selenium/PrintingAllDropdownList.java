package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class PrintingAllDropdownList {

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

            driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
            driver.manage().window().maximize();

            List<WebElement> alldropdowns = driver.findElements(By.tagName("option"));
            System.out.println("Total tags are : " + alldropdowns.size());

            for (int i=0; i<alldropdowns.size();i++){
                System.out.println("DropDown List on the page : " + alldropdowns.get(i).getAttribute("value"));
                System.out.println("DropDown List on the page : " + alldropdowns.get(i).getText());

            }
            driver.close();
        }
    }


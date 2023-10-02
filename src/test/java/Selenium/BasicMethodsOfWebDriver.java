package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.Set;

public class BasicMethodsOfWebDriver {
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

        //get(url) is used to load a new web page in the current browser window
        driver.get("https://www.saucedemo.com/");

        //manage() is used to gets the option interface
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //getCurrentUrl() is used to get a string representing the current URL that the browser is looking at.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("CurrentURL : " + currentUrl);

        //getTitle() is used to get the title of the current page
        String title = driver.getTitle();
        System.out.println("Title : " + title);

        //getPageSource() is used to get the source of the last loaded page
        String pagesource = driver.getPageSource();
        System.out.println("PageSource : " + pagesource);


        //findElement(By by) is used to find the first WebElement using teh given method.
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(5000);

        //findElements(By by) is sued to find all teh elements within the current page using the given mechanism
        List<WebElement> webelements= driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
        System.out.println("WebElements : " + webelements);

        //navigate() is used for an abstraction allowing the driver
        driver.navigate().to("https://www.selenium.dev/documentation/webdriver/elements/locators/");

        //getWindowHandle() is used to return an opaque handle to this window that uniquely identifies it within this driver instance
        String windowhandle = driver.getWindowHandle();
        System.out.println("WindowHandle: " + windowhandle);
        driver.findElement(By.linkText("Actions API")).click(); //using the linktext locator and got the actions api from the <a href span> word

        //getWindowHandles() is used to return a set of window handles which can be used to iterate over all open windows of teh WebDriver instance by passing them to switchTo().WebDriver.Options.window()
        Set<String> windowhandles =driver.getWindowHandles();
        System.out.println("WindowHandles: " + windowhandles);
        Thread.sleep(3000);

        //switchTo() is used to send the future commands to a different frame or window


        //close() is used to close the current window, quiting the browser if it's last window currently open.
        driver.close();

        //quit() is used to quit this driver , closing every associated window.
        //driver.quit();




    }
}

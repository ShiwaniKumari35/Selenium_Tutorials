package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleDropdown {
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

        driver.get("https://www.plus2net.com/php_tutorial/pb-drop-multiple.php");
        driver.manage().window().maximize();

        WebElement drop_down = driver.findElement(By.xpath("//*[@id=\"body_content\"]/div[1]/table/tbody/tr/td[1]/form/select"));
        Select select = new Select(drop_down);

        select.selectByValue("blue");
        Thread.sleep(2000);

        select.selectByIndex(3);
        Thread.sleep(2000);

        List<WebElement> allItems = select.getAllSelectedOptions();
        System.out.println(allItems.size());
        Thread.sleep(2000);

        //deselectAll() is used to Clear all selected entries.
        select.deselectAll();

        select.selectByValue("blue");
        Thread.sleep(2000);

        select.selectByIndex(3);
        Thread.sleep(2000);

        //deselectByIndex() is used to Deselect the option at the given index.
        select.deselectByIndex(3);
        Thread.sleep(2000);

        //deselectByValue() is used to Deselect all options that have a value matching the argument.
        //select.deselectByValue("red");
        //Thread.sleep(2000);

        List<WebElement> allItems1 = select.getAllSelectedOptions();
        Thread.sleep(2000);
        System.out.println(allItems1.size());

        driver.findElement(By.xpath("//*[@id=\"body_content\"]/div[1]/table/tbody/tr/td[1]/form/input")).click();
        driver.close();

    }

}

package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
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

        driver.get("https://auth.sugarcrm.com/register");
        driver.manage().window().maximize();

        WebElement drop_down = driver.findElement(By.name("job_level"));
        Select select = new Select(drop_down);

        WebElement FirstSelectedItem = select.getFirstSelectedOption();
        System.out.println(FirstSelectedItem.getText());

        //selectByIndex() is used to Select the option at the given index.
        select.selectByIndex(3);
        Thread.sleep(2000);

        //selectByValue() is used to Select all options that have a value matching the argument.
        select.selectByValue("vp");
        Thread.sleep(2000);

        //selectByVisibleText() is used to Select all options that display text matching the argument.
        select.selectByVisibleText("C Level");
        Thread.sleep(2000);


        //deselectByVisibleText() is used to Deselect all options that display text matching the argument.

        driver.close();

        //https://mdbootstrap.com/docs/standard/extended/multiselect/

    }

}

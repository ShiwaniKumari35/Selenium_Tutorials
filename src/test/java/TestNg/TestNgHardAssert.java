package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgHardAssert {
    @Test
    public void titleTest(){

        //Hard Assert which means if any assert will fail it will not go to next line it will stop there only
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedText = "Search";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com.au/");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("The Expected Title is : " + expectedTitle);
        System.out.println("The Actual Title is : " + actualTitle);

        String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
        Assert.assertEquals(actualText,expectedText);
        System.out.println("The Expected Text is : " + expectedText);
        System.out.println("The Actual Text is : " + actualText);

        driver.close();

    }
}

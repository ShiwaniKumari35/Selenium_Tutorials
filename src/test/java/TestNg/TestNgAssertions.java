package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertions {

    @Test
    public void titleTest(){

        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com.au/");
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        System.out.println("The Expected Title is : " + expectedTitle);
        System.out.println("The Actual Title is : " + actualTitle);

        driver.close();

    }

}

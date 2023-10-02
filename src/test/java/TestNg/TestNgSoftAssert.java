package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgSoftAssert {
    @Test
    public void titleTest(){

        //Soft Assert which means if any assert will fail it will go to next line it will not stop anywhere either it fails or passed
        SoftAssert softAssert = new SoftAssert();
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedText = "Search";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com.au/");
        String actualTitle = driver.getTitle();
        softAssert.assertEquals(actualTitle,expectedTitle);
        System.out.println("The Expected Title is : " + expectedTitle);
        System.out.println("The Actual Title is : " + actualTitle);

        String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
        softAssert.assertEquals(actualText,expectedText);
        System.out.println("The Expected Text is : " + expectedText);
        System.out.println("The Actual Text is : " + actualText);

        driver.close();
        //It will execute and will give passed nad failed both the test cases but if we don't use this all the test case will pass either it is wrong also
        softAssert.assertAll();

    }
}

package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TakingScreenshotListener extends BaseTestListener {

    @Test(retryAnalyzer = TestNg.ExecuteFailedTestCases.class)
    public void Login(String username, String password){
        driver.get("https://www.saucedemo.com/");
        Assert.assertTrue(false);

    }

}

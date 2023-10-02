package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MethodsOfWebElements {
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
        driver.get("https://demo.guru99.com/V4/");
        driver.manage().window().maximize();

        //sendKeys() is used to simulate typing into an element which may set it's value
        driver.findElement(By.name("uid")).sendKeys("mngr491858");
        driver.findElement(By.name("password")).sendKeys("ehAjEha");

        //clear() is used to clear the text element value
        driver.findElement(By.name("password")).clear();

        //click() is used to click this element
        //driver.findElement(By.name("btnLogin")).click();
        Thread.sleep(2000);

        //getAttribute() is used to get the value of the given attribute of the element
        String Get_Attribute = driver.findElement(By.name("uid")).getAttribute("type");
        System.out.println("Attribute of the element : " + Get_Attribute);

        //getCssValue() is used to get value of a given CSS property
        String Get_CSSValue = driver.findElement(By.name("btnLogin")).getCssValue("-webkit-rtl-ordering");
        System.out.println("CSS Value of the element : " + Get_CSSValue);

        //getLocation() is used where on the page is the top left hand corner of teh rendered element
        String Get_Location = String.valueOf(driver.findElement(By.name("btnLogin")).getLocation());
        System.out.println("Location of the element : " + Get_Location);

        //getSize() is used get the size of the height and width of the rendered element
        String Get_Size = String.valueOf(driver.findElement(By.name("btnLogin")).getSize());
        System.out.println("Size Value of the element : " + Get_Size);

        //getTagName() is used to get the tag name of this element
        String Get_TagName = String.valueOf(driver.findElement(By.name("btnLogin")).getTagName());
        System.out.println("TagName of the element : " + Get_TagName);

        //getText() is used to get the visible text
        String Get_Text = String.valueOf(driver.findElement(By.xpath("/html/body/div[2]/h2")).getText());
        System.out.println("Text Value of the element : " + Get_Text);

        //isDisplayed() is used to avoid the problem of having parse to an element
        String Get_Displayed= String.valueOf(driver.findElement(By.name("btnLogin")).isDisplayed());
        System.out.println("Display the  Value of the element : " + Get_Displayed);

        //isEnabled() is used to return true for everything but disabled input elements
        String Get_Enabled= String.valueOf(driver.findElement(By.name("btnLogin")).isEnabled());
        System.out.println("Display the enabled  Value of the element : " + Get_Enabled);

        //isSelected() is used to determine whether this element is selected or not.
        String Get_Selected= String.valueOf(driver.findElement(By.name("btnLogin")).isSelected());
        System.out.println("Display the selected Value of the element : " + Get_Selected);

        driver.close();
    }
}

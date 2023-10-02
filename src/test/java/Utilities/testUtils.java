package Utilities;

import TestNg.BaseTestListener;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class testUtils extends BaseTestListener {
    public void getScreenShot() throws IOException {
        Date currentdate = new Date();
        String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
        System.out.println(screenshotfilename);

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(".//Screenshot//" + screenshotfilename + ".png"));
    }
}

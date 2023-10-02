package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadAndWriteFromPropertiesFile {

    public static void main(String[] args) throws InterruptedException, IOException {
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("C:\\Users\\shiwa\\IdeaProjects\\Selenium_Tutorials\\src\\main\\java\\properties\\testData.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("url"));

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\shiwa\\IdeaProjects\\Selenium_Tutorials\\src\\main\\java\\properties\\testData.properties");
        properties.setProperty("testdate", "6587496");
        properties.store(outputStream, "This is customer data");


    }
}

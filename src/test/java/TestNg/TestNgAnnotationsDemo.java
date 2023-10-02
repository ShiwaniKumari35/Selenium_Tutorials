package TestNg;

import org.testng.annotations.*;

public class TestNgAnnotationsDemo {

    @BeforeClass
    public  void beforeClass(){
        System.out.println("Run this before Class");
    }

    @AfterClass
    public  void afterClass(){
        System.out.println("Run this after Class");
    }

    @BeforeTest
    public  void loginApplication(){
        System.out.println("Login to Application");
    }

    @AfterTest
    public  void logoutApplication(){
        System.out.println("Logout to Application");
    }

    @BeforeMethod
    public void connectDB(){
        System.out.println("Connected to DB");
    }

    @AfterMethod
    public void disconnectDB(){
        System.out.println("Disconnected from DB");
    }

    @Test(priority = 1)
    public void bLoginTest(){
        System.out.println("Login SuccessFul");
    }

    @Test(priority = 2)
    public void aLogOutTest(){
        System.out.println("LogOut SuccessFul");
    }
}

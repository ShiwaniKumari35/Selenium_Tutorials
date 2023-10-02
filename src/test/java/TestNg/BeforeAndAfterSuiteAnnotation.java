package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAndAfterSuiteAnnotation {
    @BeforeSuite
    public void dataSetup(){
        System.out.println("Common data setup");
    }

    @AfterSuite
    public void dataTearDown(){
        System.out.println("Common data CleanUp");
    }
}

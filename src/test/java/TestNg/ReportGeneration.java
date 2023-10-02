package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportGeneration {

    @Test
    public void reportTest1(){
        System.out.println("This is Test1");
    }
    @Test
    public void reportTest2(){
        Reporter.log("Test2");
        System.out.println("This is Test2");
    }
    @Test
    public void reportTest3(){
        System.out.println("This is Test3");
    }
    @Test
    public void reportTest4(){
        System.out.println("This is Test4");
    }
}

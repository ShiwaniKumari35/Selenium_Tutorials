package TestNg;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCases {
    Boolean dataSetUp = false;

    //This is the one way to skip the testcase
    @Test(enabled = false)
        public void skipTest1(){
        System.out.println("Skipping Test1");
    }

    //The second way to skip the test case
    @Test
    public void skipTest2(){
        System.out.println("Skipping Test2 forcefully");
        throw new SkipException("Skipping Test 2");
    }

    //Third way to skip the test case
    @Test
    public void skipTest3(){
        System.out.println("Skipping Test2 according to the conditions");
        if(dataSetUp== true){
            System.out.println("Execute the Testcase");
        }
        else {
            System.out.println("Skip the Testcase");
            throw new SkipException("Skip the Testcase");
        }
    }

    @Test
    public void Test1(){
        System.out.println("Hello World");
    }

}

package TestNg;

import org.testng.annotations.Test;

public class GroupingTest2 extends BeforeAndAfterSuiteAnnotation{

    @Test(priority = 1,groups = "regression")
    public void Test1(){
        System.out.println("Test1 SuccessFul");
    }

    @Test(priority = 2,groups = {"regression", "sanity"})
    public void Test2(){
        System.out.println("Test2 SuccessFul");

    }
    @Test(groups = "sanity")
    public void Test3(){
        System.out.println("Test3 SuccessFul");

    }
    @Test(groups = {"regression","bvt"})
    public void Test4(){
        System.out.println("Test4 SuccessFul");

    }
}

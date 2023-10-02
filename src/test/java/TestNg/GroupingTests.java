package TestNg;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


@Test(groups = "Test-Demo")
public class GroupingTests {
    @BeforeGroups(value ="sanity")
    public void beforeGroups(){
        System.out.println("Run this before sanity Group");
        }
    @AfterGroups(value ="sanity")
    public void afterGroups(){
        System.out.println("Run this after sanity Group");
        }

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

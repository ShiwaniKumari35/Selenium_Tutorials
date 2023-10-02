package TestNg;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderwithDifferentClass {
    @DataProvider(name="create")
    public Object[][] dataSet1(Method method){

        Object[][] testdata = null;
        if (method.getName().equals("test")) {
            testdata = new Object[][]
                    {
                    {"user1", "pass1"},
                    {"user2", "pass2"},
                    {"user3", "pass3"},
                    {"user4", "pass4"}
                    };
        }
        else if (method.getName().equals("test1")){
            testdata = new Object[][]
                    {
                    {"user1", "pass1", "test1"},
                    {"user2", "pass2", "test2"},
                    {"user3", "pass3", "test3"},
                    {"user4", "pass4", "test4"}
                    };
        }
        return testdata;

    }
}

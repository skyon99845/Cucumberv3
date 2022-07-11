package JunitTest;

import org.testng.annotations.Test;

public class DemoSelenium {
    @Test(priority = 2)
    public void welcome()
    {
        System.out.println("WElcome to Test Case");
    }
    
    @Test(priority =1)
    public void test2()
    {

    }
}

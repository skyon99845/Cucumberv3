package PageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MSN {
    WebDriver driver;
    public MSN(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    String Homepage="https://www.msn.com/en-in";

    public void visit()
    {
        driver.get(Homepage);
    }
}

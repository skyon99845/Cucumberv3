package PageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
    WebDriver driver;

    public Google(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    String Homepage= "https://www.google.com/";

    @FindBy(xpath =" //input[@title=\"Search\"]")
    WebElement searchButton;

    public void visit()
    {
        driver.get(Homepage);
    }

    public String getTitle()
    {
        return driver.getTitle();
    }

    public void quitTitle()
    {
        driver.quit();
    }

}

package PageFactoryModel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.util.List;

public class RedBus {
    WebDriver driver;

    public RedBus(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    String Homepage= "https://www.redbus.in/";

    @FindBy(xpath =" //input[@title=\"Search\"]")
    WebElement searchButton;

    @FindBy(id = "src")
    WebElement selectFrom;

    public void visitWebsite()
    {
        driver.get(Homepage);
    }

    public String getTitle()
    {
        return driver.getTitle();
    }

    public void closeBrowser()
    {
        driver.quit();
    }

    public void EnterTheDestination() throws InterruptedException {
        WebElement selectFrom = driver.findElement(By.id("src"));
        selectFrom.click();
        Thread.sleep(2000);
        selectFrom.sendKeys("Banglore");


        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
        for(WebElement option : options)
        {
            //System.out.println("The elements are :"+option.getText());
            if(option.getText().equalsIgnoreCase("Bangalore Airport, Bangalore"))
            {
                option.click();
                break;
            }
        }
    }

    public void EnterTheTo() throws InterruptedException {
        driver.findElement(By.id("dest")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("dest")).sendKeys("Pune");
        Thread.sleep(2000);
        List<WebElement> optionss = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
        for(WebElement option : optionss)
        {
            //System.out.println("The elements are :"+option.getText());
            if(option.getText().equalsIgnoreCase("Pune"))
            {
                option.click();
                break;
            }
        }
    }

    public void SelectTravelDate() throws InterruptedException {
        WebElement selectDate = driver.findElement(By.cssSelector("input[id=\"onward_cal\"]"));

        selectDate.click();
        Thread.sleep(1000);
        //button to move next in calendar

        WebElement nextLink = driver.findElement(By.className("next"));
        nextLink.click();
        Thread.sleep(1000);

        WebElement midLink = driver.findElement(By.xpath("//td[@class=\"monthTitle\"]"));
        //midLink.click();
        Thread.sleep(500);
        //button to move previous month in calendar
        //System.out.println("Level1");
        WebElement previousLink = driver.findElement(By.className("prev"));
        //previousLink.click();
        Thread.sleep(500);
        //System.out.println("Level 2");

        //System.out.println("Level 3");
        LocalDate date = LocalDate.now();
        String dd = date.toString();
        //System.out.println("The date is :"+dd);
        driver.findElement(By.xpath("//td[normalize-space()='14']")).click();
        Thread.sleep(500);

    }

    public  void displayTheBusTicket() throws InterruptedException {

        //String parent = "//div[@class=\"clearfix bus-item\"]";
        String parent = "//div [@class=\"clearfix bus-item\"]";
        // origionalString child1 = "//span[@class=\"f-19 f-bold\"]/text()";
        String child1 = "//span[@class=\"f-19 f-bold\"]";//bus ticket
        String child2 = "//div[@class=\"travels lh-24 f-bold d-color\"]";//busname
        //String busFareCombined = parent+" "+child1;
        String busFareCombined = "//div[@class=\"fare d-block\"] //span[contains(@class,'f-19')]";
        String busNameCombined = parent+" "+child2;
        String BusName ="//div [@class=\"travels lh-24 f-bold d-color\"]";


        //---------------New code for the Scroll Down
        try {
            long temp = 0;
            while (true) {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
                Thread.sleep(5000);
                long start = (Long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
                if (start == temp) {
                    break;
                }
                temp = start;
            }
            System.out.println("completed the scroll");
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<WebElement> busFarePrice = driver.findElements(By.xpath(busFareCombined));
        List<WebElement> busNameList = driver.findElements(By.xpath(busNameCombined));

        int ik=1;
        for(int i=0;i<= busFarePrice.size()-1;i++)
        {
            if(Integer.parseInt(busFarePrice.get(i).getText())>=2000 && Integer.parseInt(busFarePrice.get(i).getText())<=3000)
            {

                Thread.sleep(2000);
//                System.out.println("\n\nIndex is :"+ik);
//                System.out.println("The Bus Ticket Price is :"+Integer.parseInt(busFarePrice.get(i).getText()));
//                //System.out.println("The busName is :"+driver.findElement((By.xpath(BusName.toString()))).getText());
                System.out.println(ik+". BusName :"+busNameList.get(i).getText()+" BusTicket :"+Integer.parseInt(busFarePrice.get(i).getText()));
                //System.out.println(ik);
                ik++;
                Thread.sleep(1000);
            }
        }



    }
    public void searchButtonClick(){
        WebElement searchButton= driver.findElement(By.id("search_btn"));
        searchButton.click();
    }



}

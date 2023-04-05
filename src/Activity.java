import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Activity {

    WebDriver driver;

    @BeforeTest
    public void sign() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SasiKumJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--REMOTE-allow-origins=*");
        driver = new ChromeDriver(options); // Change this line
        driver.get("https://clientlinks-dev.azurewebsites.net/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Code for login test
        WebElement username = driver.findElement(By.id("signInName"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("next"));
        username.sendKeys("ws80759293");
        password.sendKeys("Wedbush123");
        loginBtn.click();
        System.out.println("Sign Successfully");
    }

    @Test
    //Account function open
    public void activity1() {
        WebElement account = driver.findElement(By.xpath("//*[@id='rootGridContainer']/div[2]/div/div[2]/div[3]/div[2]/div/p"));
        account.click();
        System.out.println("List of account details displayed");
        //Activity function open
        WebElement activity = driver.findElement(By.partialLinkText("Activity"));
        activity.click();
        System.out.println("Successfully Activity function executed");
        //start date
        WebElement startdate = driver.findElement(By.xpath("//*[@id=\'rootGridContainer\']/div[3]/div/div/div[3]/div[2]/div[1]/div[2]/div/div/input"));
        startdate.click();
        WebElement desiredStartDate = driver.findElement(By.xpath("//*[@id=\'rootGridContainer\']/div[3]/div/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[3]/div[1]/div"));
        desiredStartDate.click();
        System.out.println("Start date selected");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // End date
        WebElement endDate = driver.findElement(By.xpath("//*[@id=\'rootGridContainer\']/div[3]/div/div/div[3]/div[2]/div[1]/div[3]/div/div[1]/input"));
        endDate.click();
        WebElement desiredEndDate = driver.findElement(By.xpath("//*[@id=\'rootGridContainer\']/div[3]/div/div/div[3]/div[2]/div[1]/div[3]/div/div[2]/div[3]/div[3]/div[2]/div"));
        desiredEndDate.click();
        System.out.println("End date selected");


        String actualStartDate = startdate.getAttribute("value");
        String expectedStartDate = "03/12/2023";
        Assert.assertEquals(actualStartDate, expectedStartDate);

        String actualEndDate = endDate.getAttribute("value");
        String expectedEndDate = "03/13/2023";
        Assert.assertEquals(actualEndDate, expectedEndDate);





    }


}

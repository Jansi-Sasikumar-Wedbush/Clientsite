import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;



public class Account extends Setup {
    @Test
    public void accountlist() {
        if (driver != null) {
            WebElement accountpage = driver.findElement(By.xpath("//*[@id='rootGridContainer']/div[2]/div/div[2]/div[3]/div[2]/div/p"));
            accountpage.click();
            System.out.println("List of account details displayed");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            //driver.close();

        }
    }
}















/*@BeforeTest
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
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }*/

/*  @Test
    public void accountlist()
{
        WebElement accountpage = driver.findElement(By.xpath("//*[@id='rootGridContainer']/div[2]/div/div[2]/div[3]/div[2]/div/p"));
        accountpage.click();

        System.out.println("List of account details displayed");
    driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    driver.close();

    }*/
/*
@Test
public void accountlist() {
    if (driver != null) {
        WebElement accountpage = driver.findElement(By.xpath("//*[@id='rootGridContainer']/div[2]/div/div[2]/div[3]/div[2]/div/p"));
        accountpage.click();
        System.out.println("List of account details displayed");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.close();


    } else  {
        System.out.println("Driver is not null!");

    }*/

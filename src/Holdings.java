import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class Holdings {
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
    public void holdings() {

        WebElement account = driver.findElement(By.xpath("//*[@id='rootGridContainer']/div[2]/div/div[2]/div[3]/div[2]/div/p"));
        account.click();
        System.out.println("List of account details displayed");
        //Holdings function open
        WebElement Hold = driver.findElement(By.partialLinkText("Holdings"));
        Hold.click();
        System.out.println("Successfully holding function executed");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Go bacK Home function
        WebElement Home = driver.findElement(By.xpath("//*[@id=\"rootGridContainer\"]/div[3]/div/div/div[3]/button"));
        Home.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.close();
    }
}



//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Balance extends Setup {
    @Test
    public void accountlist() {
        if (driver != null) {
            WebElement accountpage = driver.findElement(By.xpath("//*[@id='rootGridContainer']/div[2]/div/div[2]/div[3]/div[2]/div/p"));
            accountpage.click();
            System.out.println("List of account details displayed");
            // driver.navigate().to("https://clientlinks-dev.azurewebsites.net/balance");

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            WebElement Balance = driver.findElement(By.xpath("//*[@id=\'rootGridContainer\']/div[2]/div/div[2]/div[4]/div[2]/a/div/p"));
            Balance.click();
            System.out.println("Account Balance details displayed");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        }
    }
    /*public void Balance1()
    {

   }*/

}





























 /*WebDriver driver;
    @BeforeTest
    public void sign()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SasiKumJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--REMOTE-allow-origins=*"});
        driver = new ChromeDriver(options);
        driver.get("https://clientlinks-dev.azurewebsites.net/");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("signInName"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("next"));
        username.sendKeys("ws80759293");
        password.sendKeys("Wedbush123");
        loginBtn.click();
        System.out.println("Sign Successfully");
    }*/
/*  @Test
   public void accountlist()
   {
       WebElement accountpage = driver.findElement(By.xpath("//*[@id='rootGridContainer']/div[2]/div/div[2]/div[3]/div[2]/div/p"));
       accountpage.click();

       System.out.println("List of account details displayed");
       driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);}*/
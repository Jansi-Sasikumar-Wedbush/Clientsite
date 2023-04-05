import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class Setup {
    public WebDriver driver;

    @BeforeTest
    public void sign() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SasiKumJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--REMOTE-allow-origins=*");
        driver= new ChromeDriver(options);
        driver.get("https://clientlinks-dev.azurewebsites.net/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("signInName"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("next"));
        username.sendKeys("ws80759293");
        password.sendKeys("Wedbush123");
        loginBtn.click();
        System.out.println("Sign Successfully");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}

/*public class Setup {
    public WebDriver driver;
    @BeforeTest
    public void sign() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SasiKumJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--REMOTE-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://clientlinks-dev.azurewebsites.net/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("signInName"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("next"));
        username.sendKeys("ws80759293");
        password.sendKeys("Wedbush123");
        loginBtn.click();
        System.out.println("Sign Successfully");

        //driver.close();



        //driver.findElement(By.partialLinkText("Sign Out")).click();
        // System.out.println("Sign Out Successfully");*/

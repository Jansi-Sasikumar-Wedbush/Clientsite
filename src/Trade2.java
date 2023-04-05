import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Trade2 extends Setup {
    @Test
    public void TradeMain() {
        if (driver != null) {
            WebElement Trademain = driver.findElement(By.xpath("//*[@id=\'rootGridContainer\']/div[2]/div/div[2]/a[2]/div"));
            Trademain.click();
            System.out.println("Trade main panel details displayed");
            // driver.navigate().to("https://clientlinks-dev.azurewebsites.net/balance");

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



        }
    }
    /*public void Balance1()
    {

   }*/

}


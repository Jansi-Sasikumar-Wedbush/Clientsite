import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Trade2History extends Setup{
    @Test
    public void TradeMain() {
        if (driver != null) {
            WebElement Trademain = driver.findElement(By.xpath("//*[@id=\'rootGridContainer\']/div[2]/div/div[2]/a[2]/div"));
            Trademain.click();
            System.out.println("Trade details displayed");
            // driver.navigate().to("https://clientlinks-dev.azurewebsites.net/balance");


            WebElement History = driver.findElement(By.xpath("//*[@id=\'rootGridContainer\']/div[3]/div/div/div[1]/div[2]/div/div/div[2]"));
            History.click();
            System.out.println("Trade History details displayed");


        }
    }
}

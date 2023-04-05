import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MonthlyStatements extends Setup{
    @Test
    public void credit() {
        if (driver != null) {
            WebElement DocumentPage = driver.findElement(By.xpath("//*[@id='rootGridContainer']/div[2]/div/div[2]/div[4]/div[2]/div/p"));
            DocumentPage.click();
            System.out.println("List of Document details displayed");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            //driver.close();
            WebElement Balance = driver.findElement(By.partialLinkText("Monthly Statements"));
            Balance.click();
            System.out.println("Account Balance details displayed");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PerformanceReports extends Setup{
    @Test
    public void Performance() {
        if (driver != null) {
            WebElement DocumentPage = driver.findElement(By.xpath("//*[@id='rootGridContainer']/div[2]/div/div[2]/div[4]/div[2]/div/p"));
            DocumentPage.click();
            System.out.println("List of Document details displayed");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            //driver.close();
            WebElement Perform = driver.findElement(By.partialLinkText("Performance Reports"));
            Perform.click();
            System.out.println("Performance Reports details displayed");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }
}

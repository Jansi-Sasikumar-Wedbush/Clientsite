import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class Summary extends Setup {
    @Test
    public void SummaryPage() {
        if (driver != null) {

            WebElement summary = driver.findElement(By.partialLinkText("Summary"));
            summary.click();
            System.out.println("Summary displayed");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        }
    }


}

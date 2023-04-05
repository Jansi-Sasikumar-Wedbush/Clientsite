import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Share extends  Setup{
    @Test
    public void shareholder() {
        if (driver != null) {
            WebElement DocumentPage = driver.findElement(By.xpath("//*[@id='rootGridContainer']/div[2]/div/div[2]/div[4]/div[2]/div/p"));
            DocumentPage.click();
            System.out.println("List of Document details displayed");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            //driver.close();
            WebElement Holder = driver.findElement(By.partialLinkText("Shareholder Documents"));
            Holder.click();
            System.out.println("Share Holder Documents details displayed");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }
}


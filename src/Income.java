import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Income extends Setup{
    @Test
    public void income() {
        if (driver != null) {
            WebElement accountpage = driver.findElement(By.xpath("//*[@id='rootGridContainer']/div[2]/div/div[2]/div[3]/div[2]/div/p"));
            accountpage.click();
            System.out.println("List of account details displayed");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            //driver.close();
            WebElement income = driver.findElement(By.partialLinkText("Income"));
            income.click();
            System.out.println("Account Income details displayed");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

}

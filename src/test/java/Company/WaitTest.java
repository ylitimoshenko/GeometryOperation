package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WaitTest extends TestInit {

    public WebDriver driver;


    public WebElement getGoItBtn() {
        return chromeDriver.findElement(By.xpath("//button[@class='btn']"));
    }

    public WebElement getAdressInput() {
        return chromeDriver.findElement(By.xpath("//input[@ng-model='searchParam']"));
    }

    public WebElement getFedBtn() {
        return chromeDriver.findElement((By.xpath("//a[@id='find-restaurants']")));
    }

    public void checkAndClousePopUpWindow() {
        if (getSearchAttempt().size() > 0) {
            sleep(2);
            getSearchAttempt().get(0).click();
        }
    }

    public List<WebElement> getSearchAttempt() {
        return chromeDriver.findElements(By.xpath("//a[@id='enter-address-btn']"));
    }

    public List<WebElement> getAllRest() {
        return chromeDriver.findElements(By.xpath("//ul[@id='all-rests']/li"));
    }


    @Test
    public void test1() {
        openUrl();
        getGoItBtn().click();
        getAdressInput().sendKeys("Iowa City");
        checkAndClousePopUpWindow();
        getFedBtn().click();
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(getAllRest()));
        Assert.assertTrue(chromeDriver.getCurrentUrl().contains("eatstreet.com"));
    }


    @Test
    public void test2() {
        openUrl();
        getGoItBtn().click();
        getAdressInput().sendKeys("Miami");
        getFedBtn().click();
        checkAndClousePopUpWindow();
        getFedBtn().click();
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(getAllRest()));

    }


    public void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public WebElement explicitWait(String xpath) throws InterruptedException {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        wait(1);
        return element;
    }
}



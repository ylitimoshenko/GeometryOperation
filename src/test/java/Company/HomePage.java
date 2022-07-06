package Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage  extends  BasePage{

    public HomePage(WebDriver chromeDriver) {
        super(chromeDriver);
    }

    public WebElement inputCity() {
        return chromeDriver.findElement(By.xpath("//div//input[@id='input-food-search']"));
    }

    public WebElement explicitWait(String locator){
        return new WebDriverWait(chromeDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
    public List<WebElement> explicitWaitElements(String locator){
        return new WebDriverWait(chromeDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfAllElements());
    }

    public WebElement getFedBtn() {
        return chromeDriver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public List<WebElement> getFirstRest() {
        return explicitWaitElements("//ul/li[@class='ng-scope']");
    }


    public WebElement getTitle() {
        return explicitWait("//h1[contains(text(),'New York City Restaurants')]");
    }
}

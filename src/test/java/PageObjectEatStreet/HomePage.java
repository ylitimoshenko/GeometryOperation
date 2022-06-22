package PageObjectEatStreet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends AbstractBasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    public WebElement getAdressInput() {
        return driver.findElement(By.xpath("//input[@ng-model='searchParam']"));
    }

    public WebElement getGoItBtn(){
        return driver.findElement(By.xpath("//button[@class='btn']"));
    }

    public WebElement getFedBtn() {
        return driver.findElement((By.xpath("//a[@id='find-restaurants']")));
    }

    //закриває спливаюче вікно, якщо воно є
    public List<WebElement> getSearchAttempt() {

        return driver.findElements(By.xpath("//a[@id='enter-address-btn']"));
    }
    public void  checkAndClousePopUpWindow() {
        if (getSearchAttempt().size() > 0) {
            sleep(2);
            getSearchAttempt().get(0).click();

        }
    }

}

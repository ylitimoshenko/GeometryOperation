package Company;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestExplesite extends TestInit{

    @Test
    public void searchCity() {
        HomePage homePage = new HomePage(chromeDriver);
        openUrl();
        homePage.inputCity().sendKeys("New York");
        homePage.getFedBtn().click();
        Assert.assertTrue(homePage.getTitle().isDisplayed());

    }

    @Test
    public void  getFirstRestInNY() {
        HomePage homePage = new HomePage(chromeDriver);

        chromeDriver.get("https://eatstreet.com");
//        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage.inputCity().sendKeys("New York");
        homePage.getFedBtn().click();
        homePage.getFirstRest().get(0).click();
        Assert.assertTrue(chromeDriver.getCurrentUrl().contains("https://eatstreet.com/new-york-city-ny/restaurants/all-about-indian-food"));
    }
}

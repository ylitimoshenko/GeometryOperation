package UrokForAnna;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHW  {
    WebDriver driver;
    String searchEngine = "https://www.yahoo.com/";

    @BeforeMethod
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }


    @Test
    public void googleDogs() {
        String searchWord = "dogs";
        google(searchWord);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleCats() {
        String searchWord = "cats";
        google(searchWord);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleStraus() {
        String searchWord = "straus";
        google(searchWord);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleHorse() {
        String searchWord = "horse";
        google(searchWord);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    public void google(String googleWorld) {
        driver.get(searchEngine);
        driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys(googleWorld + "\n");
    }
}

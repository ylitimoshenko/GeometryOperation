package UrokForAnna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLena extends TestInit2 {
//    String searchEngine = "https://www.google.com.ua/";


    @Test
    public void googleSomeWord() {
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
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(googleWorld + "\n");
    }
}


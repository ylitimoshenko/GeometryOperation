package Company;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskSelenium {

    @Test
    public void  testSelenium() {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rozetka.com.ua/");
        chromeDriver.findElement(By.xpath("//input")).sendKeys("блендер");
        chromeDriver.findElement(By.xpath("//input")).clear();
        String url = chromeDriver.getCurrentUrl();
        Assert.assertEquals(url, "https://rozetka.com.ua/");
    }
}

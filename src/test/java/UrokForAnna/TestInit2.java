package UrokForAnna;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit2 {
    WebDriver driver;
    String searchEngine = "https://www.google.com.ua/";

    @BeforeMethod
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        this.driver = driver;
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}

package PageObjectEatStreet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Юля\\Desktop\\GeometryOperation\\src\\test\\java\\Browser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    public void novigateEatStreet() {
        driver.get("https://eatstreet.com/");
    }

    public void openFullScreen(){
        driver.manage().window().fullscreen();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

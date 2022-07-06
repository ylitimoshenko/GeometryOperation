package PageObjectEatStreet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();

    //    put false here if you want to see browser)
    boolean headless = false;

//    @BeforeMethod //якщо не використовувати WebdriverManager//
//    public void beforeMethod() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Юля\\Desktop\\GeometryOperation\\src\\test\\java\\Browser\\chromedriver.exe");
//        driver = new ChromeDriver();
//    }
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        options.setHeadless(headless);
        driver = new ChromeDriver(options);
        if (headless) {
            driver.manage().window().setSize(new Dimension(1920, 1200));
        } else {
            driver.manage().window().maximize();
        }
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

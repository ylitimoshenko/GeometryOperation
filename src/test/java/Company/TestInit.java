package Company;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public  class  TestInit {
    public WebDriver chromeDriver;


    public void openUrl() {
        chromeDriver.get("https://eatstreet.com/");
    }
    @BeforeMethod
    public void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
//        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

        public void sleep (int seconds) {
            try {
                Thread.sleep(seconds * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    @AfterMethod
    public void afterMethod() {
        chromeDriver.quit();
    }

}

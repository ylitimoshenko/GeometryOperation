package PageObjectEatStreet;

import org.openqa.selenium.WebDriver;

public class AbstractBasePage {
    WebDriver driver;
    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

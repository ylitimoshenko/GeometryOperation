package Company;

import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver chromeDriver;

    public BasePage (WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
}

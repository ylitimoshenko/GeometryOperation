package Pecode;

import Company.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PecodePage extends BasePage {
    public PecodePage(WebDriver driver) {
        super(driver);

    }

    public void openURL() {
        chromeDriver.get("https://www.pecodesoftware.com/qa-portal/registerlogin/registerlogin.php");
    }

    public WebElement inputUserName() {
        return chromeDriver.findElement(By.xpath("//input[@placeholder='Username']"));
    }

    public WebElement inputPassword() {
        return chromeDriver.findElement(By.xpath("//input[@placeholder='Password']"));
    }

    public WebElement loginBtn() {
        return chromeDriver.findElement(By.xpath("//input[@value='Login']"));
    }

    public Object msgNoAccountFound() {
        return chromeDriver.findElement(By.xpath("//span[contains(text(), 'No account found with that username.')]"));
    }
}

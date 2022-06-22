package MyTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEldoradoMyLogin {

    @Test
    public void myclick() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Юля\\Desktop\\GeometryOperation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://eldorado.ua/");
        driver.findElement(By.xpath("//span[@class='header-icon-description']")).click();
        sleep(1);
        driver.findElement(By.xpath("//input[@class='new-not-require-input ']")).sendKeys(" 952222222");
        driver.findElement(By.xpath("//button[@type='submit'] ")).click();
        sleep(1);
        By.xpath("//input[@name='password']").findElement(driver).sendKeys("аорп123Є");
        sleep(2);
        driver.findElement(By.xpath("//button[@class='brand-button']")).click();
        sleep(5);
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='new-not-require-input-error-text']")).isDisplayed());
        driver.quit();

    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds*2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
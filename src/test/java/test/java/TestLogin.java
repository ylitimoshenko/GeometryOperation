package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {

    @Test
    public void doit() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Юля\\Desktop\\GeometryOperation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.eatstreet.com/");
        driver.findElement(By.xpath("//button[contains(text(), 'Got it')]")).click();
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hubabuba@africa.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hubabubapassword");
        driver.findElement(By.xpath("//button[@id='signin']")).click();
        sleep(2);
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(), 'is incorrect')]")).isDisplayed());
        driver.quit();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 6000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

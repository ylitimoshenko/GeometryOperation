package MyTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginInter {

    @Test
    public void interatlet (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Юля\\Desktop\\GeometryOperation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get("https://prof.interatletika.ua/ru/");
        driver.findElement(By.xpath("//a[@class='user_name_link']")).click();
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("YYYYY");
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='Login']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isDisplayed());
        driver.quit();



    }
}

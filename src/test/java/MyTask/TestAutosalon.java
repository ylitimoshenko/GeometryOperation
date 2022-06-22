package MyTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestAutosalon {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Юля\\Desktop\\GeometryOperation\\src\\test\\java\\Browser\\chromedriver.exe");
        driver = new ChromeDriver();
    }
//    @AfterMethod
//   public void afterMethod(){
//    driver.quit();
//}
    public void navigateGoogle(){
        driver.get("https://www.google.com/");
    }
    public WebElement getGoogleInput(){
        return driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
    }
    public List<WebElement> get5Site(){
        return driver.findElements(By.xpath("//div[@class='v7W49e']/div"));
    }
    public List<WebElement> getListNewCars(){
        return driver.findElements(By.xpath("//div[@class='col-md-12 mobile-scroll']/div"));
    }
    public WebElement getInputCarBodyType() {
        return driver.findElement(By.xpath("//div[@class='filters_left-item']/button"));
    }




    @Test
    public void TestGoogleCow(){
        navigateGoogle();
        getGoogleInput().sendKeys("автосалон\n");
        get5Site().get(2).click();
        getListNewCars().get(0).click();
        getInputCarBodyType().click();
        getInputCarBodyType();

    }



}









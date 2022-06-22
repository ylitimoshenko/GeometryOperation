package MyTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCartNext  {

    @Test

    public void testCartNext () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Юля\\Desktop\\GeometryOperation\\src\\test\\java\\Browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www4.next.co.uk/");
        driver.findElement(By.xpath("//span[@class='PrimarynavlinksText ']")).click();
        sleep (1);
        driver.findElement(By.xpath("//a[@href='/shop/gender-women-productaffiliation-loungewear-0']")).click();
        driver.findElements(By.xpath("//span[@class='Desc ']")).get(0).click();
        sleep(3);
        driver.findElement(By.xpath("//div[@id='dk_container_Colour-685493']")).click();
        driver.findElement(By.xpath("//a[@data-dk-dropdown-value='747-806']")).click();
        driver.findElement(By.xpath("//div[@id='dk_container_Size-747-806']")).click();
        driver.findElements(By.xpath("//a[@class='dk_dropdown_option']")).get(35).click();
        driver.findElement(By.xpath("//a[@class='nxbtn primary btn-addtobag addToBagCTA add-to-bag Enabled']")).click();
        driver.findElement(By.xpath("//div[@class='Icon active']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='checkout']")).isDisplayed());
        driver.quit();

    }

        public void sleep(int seconds){
            try {
                Thread.sleep(seconds * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


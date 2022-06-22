package MyTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMyHusbent {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Юля\\Desktop\\GeometryOperation\\src\\test\\java\\Browser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }

    public void navigateInteratletika(){
        driver.get("https://prof.interatletika.ua/ru/");
    }

    public WebElement getSignInMenu(){
        return driver.findElement(By.xpath("//a[@class='user_name_link']"));
    }

    public WebElement getPasswordInput(){
        return driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
    }


    public WebElement getSignInButton(){
        return driver.findElement(By.xpath("//input[@name='Login']"));
    }

    public WebElement incorrectCreds(){
        return driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
    }

    @Test
    public void testThree(){
        navigateInteratletika();
        getSignInMenu().click();
        getEmailInput().sendKeys("hubabuba@africa");
        getPasswordInput().sendKeys("hubabubapassword");
        getSignInButton().click();
        sleep(2);
        Assert.assertTrue(incorrectCreds().isDisplayed());
    }

    @Test
    public void testTwo(){

        navigateInteratletika();
        getSignInMenu().click();
        getEmailInput().sendKeys("KJHGKjhgkjhgsdf^%$&%^$&^4");
        getPasswordInput().sendKeys("123");
        getSignInButton().click();
        sleep(2);
        Assert.assertTrue(incorrectCreds().isDisplayed());
    }

    @Test
    public void testOne(){
        navigateInteratletika();
        getSignInMenu().click();
        getEmailInput().sendKeys("hubabuba@africa.com");
        getPasswordInput().sendKeys("hubabubapassword");
        getSignInButton().click();
        sleep(2);
        Assert.assertTrue(incorrectCreds().isDisplayed());
    }

    @Test
    public void testFour(){
        navigateInteratletika();
        getSignInMenu().click();
        getEmailInput().sendKeys("try {\fjhy");
        getPasswordInput().sendKeys("hubabubapassword");
        getSignInButton().click();
        sleep(2);
        Assert.assertTrue(incorrectCreds().isDisplayed());
    }


    @Test
    public void testFive(){
        navigateInteratletika();
        getSignInMenu().click();
        getEmailInput().sendKeys("%%%%%№№№№;;;;");
        getPasswordInput().sendKeys("hubabubapassword");
        getSignInButton().click();
        sleep(2);
        Assert.assertTrue(incorrectCreds().isDisplayed());
    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

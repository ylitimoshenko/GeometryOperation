package MyTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestEatStreet {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Юля\\Desktop\\GeometryOperation\\src\\test\\java\\Browser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void novigateEatStreet() {
        driver.get("https://eatstreet.com/");
    }

    public WebElement getAdressInput() {
        return driver.findElement(By.xpath("//input[@ng-model='searchParam']"));
    }

    public WebElement getGoItBtn(){
        return driver.findElement(By.xpath("//button[@class='btn']"));
    }

    public WebElement getFedBtn() {
        return driver.findElement((By.xpath("//a[@id='find-restaurants']")));
    }

    //закриває спливаюче вікно, якщо воно є
    public List<WebElement> getSearchAttempt() {
        return driver.findElements(By.xpath("//a[@id='enter-address-btn']"));
    }

    public List<WebElement> getAllRest() {
        return driver.findElements(By.xpath("//ul[@id='all-rests']/li"));
    }

    public List<WebElement> getPageNumberList() {
        return driver.findElements(By.xpath("//ul[@class='pagination__pages']//a"));
    }

    public void getSelectPageRest(){
        if (getPageNumberList().size()>0) {
            sleep(5);
            getPageNumberList().get(getPageNumberList().size() - 1).click();
        }
    }

    public void getSelect70Rest() {
        if (getPageNumberList().size() > 0) {
            getPageNumberList().get(1).click();
            getAllRest().get(19).click();
        } else {getAllRest().get(getAllRest().size() - 1).click();
        }
    }

    public void  checkAndClousePopUpWindow() {
        if (getSearchAttempt().size() > 0) {
            sleep(2);
            getSearchAttempt().get(0).click();
        }
    }






    @Test
    public void testEatStreet1() {
        novigateEatStreet();
        getGoItBtn().click();
        getAdressInput().sendKeys("Miami");
        getFedBtn().click();
        checkAndClousePopUpWindow();
        getFedBtn().click();
        sleep(5);
        //скрол сторінки
//        jse.executeScript("window.scrollBy(0,15000)");
         getAllRest().get(0).click();

    }
// открывает 70 ресторан
    @Test
    public void testEatStreet2() {
        novigateEatStreet();
        getGoItBtn().click();
        getAdressInput().sendKeys("new york");
        getFedBtn().click();
        checkAndClousePopUpWindow();
        getFedBtn().click();
        sleep(5);
        driver.manage().window().fullscreen();
        getSelectPageRest();
        sleep(3);
        getSelect70Rest();


    }
    @Test
    public void testEatStreet3() {
        novigateEatStreet();
        getGoItBtn().click();
        getAdressInput().sendKeys("Iowa City");
        getFedBtn().click();
        checkAndClousePopUpWindow();
        getFedBtn().click();
        sleep(3);
        getAllRest().get(0).click();

    }
    @Test
    public void testEatStreet4() {
        novigateEatStreet();
        getGoItBtn().click();
        getAdressInput().sendKeys("Orlando, FL");
        getFedBtn().click();
        checkAndClousePopUpWindow();
        getFedBtn().click();
        sleep(3);
        getAllRest().get(getAllRest().size() - 2).click();

    }
    @Test
    public void testEatStreet5() {
        novigateEatStreet();
        getGoItBtn().click();
        getAdressInput().sendKeys("Corvallis");
        getFedBtn().click();
        checkAndClousePopUpWindow();
        getFedBtn().click();
        sleep(3);
        getAllRest().get(getAllRest().size() -5).click();

    }
    @Test
    public void testEatStreet6() {
        novigateEatStreet();
        getAdressInput().sendKeys("Seattle, WA");
        getFedBtn().click();
        checkAndClousePopUpWindow();
        getFedBtn().click();
        sleep(1);
        getGoItBtn().click();
        getAllRest().get(0).click();
    }

   @Test
    public void testEatStreet7() {
        novigateEatStreet();
        getGoItBtn().click();
        getAdressInput().sendKeys("new york");
        getFedBtn().click();
        checkAndClousePopUpWindow();
        getFedBtn().click();
        //метод який выдкриваэ выкно браузера на повний екран
        driver.manage().window().fullscreen();
        getSelectPageRest();
        sleep(5);
        getAllRest().get(getAllRest().size() -1).click();
   }

   @Test
    public void testEatStreet9() {
        novigateEatStreet();
        getAdressInput().sendKeys("Beverly Hills");
        getFedBtn().click();
        checkAndClousePopUpWindow();
        getFedBtn().click();
        sleep(3);
        getGoItBtn().click();
        getAllRest().get(0).click();

   }

   @Test
   public void testEatStreet10() {
       novigateEatStreet();
       getAdressInput().sendKeys("new york");
       getFedBtn().click();
       checkAndClousePopUpWindow();
       getFedBtn().click();
       getGoItBtn().click();
       sleep(5);
       getPageNumberList().get(getPageNumberList().size() -1).click();
       sleep(5);
       getAllRest().get(0).click();

   }
    @Test
    public void testEatStreet11() {
        novigateEatStreet();
        getGoItBtn().click();
        getAdressInput().sendKeys("fenix");
        getFedBtn().click();
        checkAndClousePopUpWindow();
        getFedBtn().click();
        sleep(5);
        driver.manage().window().fullscreen();
        getSelectPageRest();
        sleep(3);
        getSelect70Rest();
    }



}





package UrokForAnna;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ListForMasiv {

//    public WebDriver driver;
//
//    @BeforeMethod
//    public void beforeMethod() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get(googleSearch);
//    }
//
//    @Test
//    public void doit() {
//        String Serch = System.getProperty("serch");
//        if (Serch == null) {
//            driver.get("https://www.google.com");
//        } else if (Serch.equals("googleSearch")) {
//            driver.get("https://www.google.com");
//        } else if (Serch.equals("bingSearch")) {
//            driver.get("https://www.bing.com");
//        } else if (Serch.equals("yahooSearch")) {
//            driver.get("https://www.yahoo.com");
//        }
//    }
//
//    String googleSearch = "https://www.google.com";
//    String bingSearch = "https://www.bing.com";
//    String yahooSearch = "https://www.yahoo.com";
//
//
//    List<String> wordsToCheck = Arrays.asList("Cat", "Dog", "Straus", "pig", "horse", "bear", "chick", "bee", "Ant", "fish");
//
//        for (String word : wordsToCheck) {
//            driver.findElement(By.xpath("//input[@name='q']")).sendKeys(word + "\n");
//            new WebDriverWait(driver, 15).until(ExpectedConditions.urlContains(word));
//            Assert.assertTrue(driver.getCurrentUrl().contains(word));
//            driver.get(googleSearch);
//        }
//    @Test
//    public void searchAnimals() {
//        String yahooSearch = "https://www.yahoo.com";
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get(yahooSearch);
//
//        List<String> wordsToCheck = Arrays.asList("Cat", "Dog", "Straus", "pig", "horse", "bear", "chick", "bee");
//
//        for (String word : wordsToCheck) {
//            driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys(word + "\n");
//            new WebDriverWait(driver, 15).until(ExpectedConditions.urlContains(word));
//            Assert.assertTrue(driver.getCurrentUrl().contains(word));
//            driver.get(yahooSearch);
//        }
//    }
//
//    @Test
//    public void searchAnimalsBing() {
//
//        String bingSearch = "https://www.bing.com";
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get(bingSearch);
//
//        List<String> wordsToCheck = Arrays.asList("Cat", "Dog", "Straus", "pig", "horse", "bear", "chick", "bee");
//
//        for (String word : wordsToCheck) {
//            driver.findElement(By.xpath("//input[@name='q']")).sendKeys(word + "\n");
//            new WebDriverWait(driver, 15).until(ExpectedConditions.urlContains(word));
//            Assert.assertTrue(driver.getCurrentUrl().contains(word));
//            driver.get(bingSearch);
//        }
//    }
}

package PageObjectEatStreet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RestPage extends AbstractBasePage {

        public RestPage(WebDriver driver){
                super(driver);}

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

}

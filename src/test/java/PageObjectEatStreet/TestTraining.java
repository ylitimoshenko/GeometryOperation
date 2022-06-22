package PageObjectEatStreet;
import org.testng.annotations.Test;

public class TestTraining extends TestInit{



    @Test
    public void testEatStreet1() {
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        novigateEatStreet();
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("Miami");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        sleep(5);
        //скрол сторінки
//        jse.executeScript("window.scrollBy(0,15000)");
        restPage.getAllRest().get(0).click();

    }

    @Test
    public void testEatStreet2() {
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        novigateEatStreet();
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("new york");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        sleep(5);
        openFullScreen();
        restPage.getSelectPageRest();
        sleep(3);
        restPage.getSelect70Rest();


    }
    @Test
    public void testEatStreet3() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("Iowa City");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        sleep(3);
        restPage.getAllRest().get(0).click();

    }
    @Test
    public void testEatStreet4() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("Orlando, FL");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        sleep(3);
        restPage.getAllRest().get(restPage.getAllRest().size() - 2).click();

    }
    @Test
    public void testEatStreet5() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("Corvallis");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        sleep(3);
        restPage.getAllRest().get(restPage.getAllRest().size() -5).click();

    }
    @Test
    public void testEatStreet6() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getAdressInput().sendKeys("Seattle, WA");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        sleep(1);
        homePage.getGoItBtn().click();
        restPage.getAllRest().get(0).click();
    }

    @Test
    public void testEatStreet7() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("new york");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        openFullScreen();
        restPage.getSelectPageRest();
        sleep(5);
        restPage.getAllRest().get(restPage.getAllRest().size() -1).click();
    }

    @Test
    public void testEatStreet9() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getAdressInput().sendKeys("Beverly Hills");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        sleep(3);
        homePage.getGoItBtn().click();
        restPage.getAllRest().get(0).click();

    }

    @Test
    public void testEatStreet10() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getAdressInput().sendKeys("new york");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        homePage.getGoItBtn().click();
        sleep(5);
        restPage.getPageNumberList().get(restPage.getPageNumberList().size() -1).click();
        sleep(5);
         restPage.getAllRest().get(0).click();

    }
    @Test
    public void testEatStreet11() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("fenix");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();restPage.
        sleep(5);
        openFullScreen();
        restPage.getSelectPageRest();
        sleep(3);
        restPage.getSelect70Rest();
    }

    @Test
    public void testEatStreet12() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("Manhattan");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        sleep(3);
        restPage.getAllRest().get(0).click();
    }
    @Test
    public void testEatStreet13() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("Salina");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        sleep(3);
        restPage.getAllRest().get(0).click();

    }
    @Test
    public void testEatStreet14() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("Fairfax");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        sleep(3);
        restPage.getAllRest().get(0).click();
    }

    @Test
    public void testEatStreet15() {
        novigateEatStreet();
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("Toledo");
        homePage.getFedBtn().click();
        homePage.checkAndClousePopUpWindow();
        openFullScreen();
        homePage.getFedBtn().click();
        sleep(3);
        restPage.getAllRest().get(0).click();
    }


    }



